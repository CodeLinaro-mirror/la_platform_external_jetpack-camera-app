"""Tests that JCA constants used by Camera ITS exist in the JCA app."""

import logging
import os
import pathlib
import tokenize
import unittest

_JCA_PATH_SYMBOL = 'JCA_PATH'
_UI_INTERACTION_UTILS_SOURCE_NAME = 'ui_interaction_utils.txt'


def _test_constants_in_sync(path: os.PathLike[str]) -> None:
  """Ensures that JCA constants used by Camera ITS path exist.

  Args:
    path: path to file with Camera ITS/JCA constants.
  Raises:
    AssertionError: If a JCA constant used by Camera ITS is not found in the
      JCA app source code.
  """
  with open(path, 'r') as f:
    full_jca_path = None
    jca_file_content = None
    for token in tokenize.generate_tokens(f.readline):
      token_type, token_string, _, _, _ = token
      if token_type == tokenize.COMMENT:
        # handle JCA path block start/end
        if _JCA_PATH_SYMBOL in token_string:
          if not full_jca_path:
            # always 1st substring after `JCA_PATH`, terminated by whitespace
            full_jca_path = pathlib.Path(
                token_string.split(_JCA_PATH_SYMBOL)[1].strip().split(' ')[0]
            )
            logging.info(
                'Checking JCA path %s for constants', full_jca_path)
            # TODO: b/415298260 - handle XML files more robustly
            with open(full_jca_path, 'r', encoding='utf-8') as file:
              jca_file_content = file.read()
          else:
            logging.info(
                'Finished checking JCA path %s for constants', full_jca_path)
            full_jca_path = None
            jca_file_content = None
      # within a JCA constant block
      elif full_jca_path and token_type == tokenize.STRING:
        jca_constant_name = token_string.strip('"').strip("'")
        if jca_constant_name in jca_file_content:
          logging.info(
              'JCA constant %s found in %s', jca_constant_name, full_jca_path
          )
        else:
          raise AssertionError(
              f'Constant {jca_constant_name} not found in {full_jca_path}')


class CameraItsConstantsInSyncTest(unittest.TestCase):
  """Tests for test_constants_in_sync.py."""

  def test_ui_interaction_utils_constants_in_sync(self):
    _test_constants_in_sync(_UI_INTERACTION_UTILS_SOURCE_NAME)

if __name__ == '__main__':
  unittest.main()
