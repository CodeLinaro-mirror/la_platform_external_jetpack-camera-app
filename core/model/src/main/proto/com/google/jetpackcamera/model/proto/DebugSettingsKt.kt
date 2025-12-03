package com.google.jetpackcamera.model.proto;

// @kotlin.jvm.JvmName("-initializedebugSettings")
public fun debugSettings(block: com.google.jetpackcamera.model.proto.DebugSettingsKt.Dsl.() -> kotlin.Unit): com.google.jetpackcamera.model.proto.DebugSettings =
    com.google.jetpackcamera.model.proto.DebugSettingsKt.Dsl._create(com.google.jetpackcamera.model.proto.DebugSettings.newBuilder()).apply { block() }._build()
public object DebugSettingsKt {
    // @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    // @com.google.protobuf.kotlin.ProtoDslMarker
    public class Dsl private constructor(
        private val _builder: com.google.jetpackcamera.model.proto.DebugSettings.Builder
    ) {
        public companion object {
            // @kotlin.jvm.JvmSynthetic
            // @kotlin.PublishedApi
            internal fun _create(builder: com.google.jetpackcamera.model.proto.DebugSettings.Builder): Dsl = Dsl(builder)
        }

        // @kotlin.jvm.JvmSynthetic
        // @kotlin.PublishedApi
        internal fun _build(): com.google.jetpackcamera.model.proto.DebugSettings = _builder.build()

        /**
         * <code>bool is_debug_mode_enabled = 1;</code>
         */
        public var isDebugModeEnabled: kotlin.Boolean
            // @JvmName("getIsDebugModeEnabled")
            get() = _builder.getIsDebugModeEnabled()
            // @JvmName("setIsDebugModeEnabled")
            set(value) {
                _builder.setIsDebugModeEnabled(value)
            }
        /**
         * <code>bool is_debug_mode_enabled = 1;</code>
         */
        public fun clearIsDebugModeEnabled() {
            _builder.clearIsDebugModeEnabled()
        }

        /**
         * <code>optional .LensFacing single_lens_mode = 2;</code>
         */
        public var singleLensMode: com.google.jetpackcamera.model.proto.LensFacing
            // @JvmName("getSingleLensMode")
            get() = _builder.getSingleLensMode()
            // @JvmName("setSingleLensMode")
            set(value) {
                _builder.setSingleLensMode(value)
            }
        /**
         * <code>optional .LensFacing single_lens_mode = 2;</code>
         */
        public fun clearSingleLensMode() {
            _builder.clearSingleLensMode()
        }
        /**
         * <code>optional .LensFacing single_lens_mode = 2;</code>
         * @return Whether the singleLensMode field is set.
         */
        public fun hasSingleLensMode(): kotlin.Boolean {
            return _builder.hasSingleLensMode()
        }

        /**
         * <code>.TestPattern test_pattern = 3;</code>
         */
        public var testPattern: com.google.jetpackcamera.model.proto.TestPattern
            // @JvmName("getTestPattern")
            get() = _builder.getTestPattern()
            // @JvmName("setTestPattern")
            set(value) {
                _builder.setTestPattern(value)
            }
        /**
         * <code>.TestPattern test_pattern = 3;</code>
         */
        public fun clearTestPattern() {
            _builder.clearTestPattern()
        }
        /**
         * <code>.TestPattern test_pattern = 3;</code>
         * @return Whether the testPattern field is set.
         */
        public fun hasTestPattern(): kotlin.Boolean {
            return _builder.hasTestPattern()
        }
    }
}
public fun com.google.jetpackcamera.model.proto.DebugSettings.copy(block: com.google.jetpackcamera.model.proto.DebugSettingsKt.Dsl.() -> kotlin.Unit): com.google.jetpackcamera.model.proto.DebugSettings =
    com.google.jetpackcamera.model.proto.DebugSettingsKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val com.google.jetpackcamera.model.proto.DebugSettingsOrBuilder.testPatternOrNull: com.google.jetpackcamera.model.proto.TestPattern?
    get() = if (hasTestPattern()) getTestPattern() else null


