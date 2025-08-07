package com.google.jetpackcamera.model.proto

// @kotlin.jvm.JvmName("-initializetestPattern")
public fun testPattern(block: com.google.jetpackcamera.model.proto.TestPatternKt.Dsl.() -> kotlin.Unit): com.google.jetpackcamera.model.proto.TestPattern =
    com.google.jetpackcamera.model.proto.TestPatternKt.Dsl._create(com.google.jetpackcamera.model.proto.TestPattern.newBuilder()).apply { block() }._build()
public object TestPatternKt {
    // @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    // @com.google.protobuf.kotlin.ProtoDslMarker
    public class Dsl private constructor(
        private val _builder: com.google.jetpackcamera.model.proto.TestPattern.Builder
    ) {
        public companion object {
            // @kotlin.jvm.JvmSynthetic
            // @kotlin.PublishedApi
            internal fun _create(builder: com.google.jetpackcamera.model.proto.TestPattern.Builder): Dsl = Dsl(builder)
        }

        // @kotlin.jvm.JvmSynthetic
        // @kotlin.PublishedApi
        internal fun _build(): com.google.jetpackcamera.model.proto.TestPattern = _builder.build()

        /**
         * <code>.TestPatternOff off = 1;</code>
         */
        public var off: com.google.jetpackcamera.model.proto.TestPatternOff
            // @JvmName("getOff")
            get() = _builder.getOff()
            // @JvmName("setOff")
            set(value) {
                _builder.setOff(value)
            }
        /**
         * <code>.TestPatternOff off = 1;</code>
         */
        public fun clearOff() {
            _builder.clearOff()
        }
        /**
         * <code>.TestPatternOff off = 1;</code>
         * @return Whether the off field is set.
         */
        public fun hasOff(): kotlin.Boolean {
            return _builder.hasOff()
        }

        /**
         * <code>.TestPatternColorBars color_bars = 2;</code>
         */
        public var colorBars: com.google.jetpackcamera.model.proto.TestPatternColorBars
            // @JvmName("getColorBars")
            get() = _builder.getColorBars()
            // @JvmName("setColorBars")
            set(value) {
                _builder.setColorBars(value)
            }
        /**
         * <code>.TestPatternColorBars color_bars = 2;</code>
         */
        public fun clearColorBars() {
            _builder.clearColorBars()
        }
        /**
         * <code>.TestPatternColorBars color_bars = 2;</code>
         * @return Whether the colorBars field is set.
         */
        public fun hasColorBars(): kotlin.Boolean {
            return _builder.hasColorBars()
        }

        /**
         * <code>.TestPatternColorBarsFadeToGray color_bars_fade_to_gray = 3;</code>
         */
        public var colorBarsFadeToGray: com.google.jetpackcamera.model.proto.TestPatternColorBarsFadeToGray
            // @JvmName("getColorBarsFadeToGray")
            get() = _builder.getColorBarsFadeToGray()
            // @JvmName("setColorBarsFadeToGray")
            set(value) {
                _builder.setColorBarsFadeToGray(value)
            }
        /**
         * <code>.TestPatternColorBarsFadeToGray color_bars_fade_to_gray = 3;</code>
         */
        public fun clearColorBarsFadeToGray() {
            _builder.clearColorBarsFadeToGray()
        }
        /**
         * <code>.TestPatternColorBarsFadeToGray color_bars_fade_to_gray = 3;</code>
         * @return Whether the colorBarsFadeToGray field is set.
         */
        public fun hasColorBarsFadeToGray(): kotlin.Boolean {
            return _builder.hasColorBarsFadeToGray()
        }

        /**
         * <code>.TestPatternPN9 pn9 = 4;</code>
         */
        public var pn9: com.google.jetpackcamera.model.proto.TestPatternPN9
            // @JvmName("getPn9")
            get() = _builder.getPn9()
            // @JvmName("setPn9")
            set(value) {
                _builder.setPn9(value)
            }
        /**
         * <code>.TestPatternPN9 pn9 = 4;</code>
         */
        public fun clearPn9() {
            _builder.clearPn9()
        }
        /**
         * <code>.TestPatternPN9 pn9 = 4;</code>
         * @return Whether the pn9 field is set.
         */
        public fun hasPn9(): kotlin.Boolean {
            return _builder.hasPn9()
        }

        /**
         * <code>.TestPatternCustom1 custom1 = 5;</code>
         */
        public var custom1: com.google.jetpackcamera.model.proto.TestPatternCustom1
            // @JvmName("getCustom1")
            get() = _builder.getCustom1()
            // @JvmName("setCustom1")
            set(value) {
                _builder.setCustom1(value)
            }
        /**
         * <code>.TestPatternCustom1 custom1 = 5;</code>
         */
        public fun clearCustom1() {
            _builder.clearCustom1()
        }
        /**
         * <code>.TestPatternCustom1 custom1 = 5;</code>
         * @return Whether the custom1 field is set.
         */
        public fun hasCustom1(): kotlin.Boolean {
            return _builder.hasCustom1()
        }

        /**
         * <code>.TestPatternSolidColor solid_color = 6;</code>
         */
        public var solidColor: com.google.jetpackcamera.model.proto.TestPatternSolidColor
            // @JvmName("getSolidColor")
            get() = _builder.getSolidColor()
            // @JvmName("setSolidColor")
            set(value) {
                _builder.setSolidColor(value)
            }
        /**
         * <code>.TestPatternSolidColor solid_color = 6;</code>
         */
        public fun clearSolidColor() {
            _builder.clearSolidColor()
        }
        /**
         * <code>.TestPatternSolidColor solid_color = 6;</code>
         * @return Whether the solidColor field is set.
         */
        public fun hasSolidColor(): kotlin.Boolean {
            return _builder.hasSolidColor()
        }
        public val patternCase: com.google.jetpackcamera.model.proto.TestPattern.PatternCase
            // @JvmName("getPatternCase")
            get() = _builder.getPatternCase()

        public fun clearPattern() {
            _builder.clearPattern()
        }
    }
}
public fun com.google.jetpackcamera.model.proto.TestPattern.copy(block: com.google.jetpackcamera.model.proto.TestPatternKt.Dsl.() -> kotlin.Unit): com.google.jetpackcamera.model.proto.TestPattern =
    com.google.jetpackcamera.model.proto.TestPatternKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val com.google.jetpackcamera.model.proto.TestPatternOrBuilder.offOrNull: com.google.jetpackcamera.model.proto.TestPatternOff?
    get() = if (hasOff()) getOff() else null

public val com.google.jetpackcamera.model.proto.TestPatternOrBuilder.colorBarsOrNull: com.google.jetpackcamera.model.proto.TestPatternColorBars?
    get() = if (hasColorBars()) getColorBars() else null

public val com.google.jetpackcamera.model.proto.TestPatternOrBuilder.colorBarsFadeToGrayOrNull: com.google.jetpackcamera.model.proto.TestPatternColorBarsFadeToGray?
    get() = if (hasColorBarsFadeToGray()) getColorBarsFadeToGray() else null

public val com.google.jetpackcamera.model.proto.TestPatternOrBuilder.pn9OrNull: com.google.jetpackcamera.model.proto.TestPatternPN9?
    get() = if (hasPn9()) getPn9() else null

public val com.google.jetpackcamera.model.proto.TestPatternOrBuilder.custom1OrNull: com.google.jetpackcamera.model.proto.TestPatternCustom1?
    get() = if (hasCustom1()) getCustom1() else null

public val com.google.jetpackcamera.model.proto.TestPatternOrBuilder.solidColorOrNull: com.google.jetpackcamera.model.proto.TestPatternSolidColor?
    get() = if (hasSolidColor()) getSolidColor() else null


