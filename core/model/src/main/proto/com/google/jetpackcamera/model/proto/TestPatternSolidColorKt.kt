package com.google.jetpackcamera.model.proto

// @kotlin.jvm.JvmName("-initializetestPatternSolidColor")
public fun testPatternSolidColor(block: com.google.jetpackcamera.model.proto.TestPatternSolidColorKt.Dsl.() -> kotlin.Unit): com.google.jetpackcamera.model.proto.TestPatternSolidColor =
    com.google.jetpackcamera.model.proto.TestPatternSolidColorKt.Dsl._create(com.google.jetpackcamera.model.proto.TestPatternSolidColor.newBuilder()).apply { block() }._build()
public object TestPatternSolidColorKt {
    // @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    // @com.google.protobuf.kotlin.ProtoDslMarker
    public class Dsl private constructor(
        private val _builder: com.google.jetpackcamera.model.proto.TestPatternSolidColor.Builder
    ) {
        public companion object {
            // @kotlin.jvm.JvmSynthetic
            // @kotlin.PublishedApi
            internal fun _create(builder: com.google.jetpackcamera.model.proto.TestPatternSolidColor.Builder): Dsl = Dsl(builder)
        }

        // @kotlin.jvm.JvmSynthetic
        // @kotlin.PublishedApi
        internal fun _build(): com.google.jetpackcamera.model.proto.TestPatternSolidColor = _builder.build()

        /**
         * <code>uint32 red = 1;</code>
         */
        public var red: kotlin.Int
            // @JvmName("getRed")
            get() = _builder.getRed()
            // @JvmName("setRed")
            set(value) {
                _builder.setRed(value)
            }
        /**
         * <code>uint32 red = 1;</code>
         */
        public fun clearRed() {
            _builder.clearRed()
        }

        /**
         * <code>uint32 green_even = 2;</code>
         */
        public var greenEven: kotlin.Int
            // @JvmName("getGreenEven")
            get() = _builder.getGreenEven()
            // @JvmName("setGreenEven")
            set(value) {
                _builder.setGreenEven(value)
            }
        /**
         * <code>uint32 green_even = 2;</code>
         */
        public fun clearGreenEven() {
            _builder.clearGreenEven()
        }

        /**
         * <code>uint32 green_odd = 3;</code>
         */
        public var greenOdd: kotlin.Int
            // @JvmName("getGreenOdd")
            get() = _builder.getGreenOdd()
            // @JvmName("setGreenOdd")
            set(value) {
                _builder.setGreenOdd(value)
            }
        /**
         * <code>uint32 green_odd = 3;</code>
         */
        public fun clearGreenOdd() {
            _builder.clearGreenOdd()
        }

        /**
         * <code>uint32 blue = 4;</code>
         */
        public var blue: kotlin.Int
            // @JvmName("getBlue")
            get() = _builder.getBlue()
            // @JvmName("setBlue")
            set(value) {
                _builder.setBlue(value)
            }
        /**
         * <code>uint32 blue = 4;</code>
         */
        public fun clearBlue() {
            _builder.clearBlue()
        }
    }
}
public fun com.google.jetpackcamera.model.proto.TestPatternSolidColor.copy(block: com.google.jetpackcamera.model.proto.TestPatternSolidColorKt.Dsl.() -> kotlin.Unit): com.google.jetpackcamera.model.proto.TestPatternSolidColor =
    com.google.jetpackcamera.model.proto.TestPatternSolidColorKt.Dsl._create(this.toBuilder()).apply { block() }._build()
