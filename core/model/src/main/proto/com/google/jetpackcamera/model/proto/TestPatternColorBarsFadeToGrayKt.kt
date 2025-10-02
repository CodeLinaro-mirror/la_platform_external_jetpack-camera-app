package com.google.jetpackcamera.model.proto

// @kotlin.jvm.JvmName("-initializetestPatternColorBarsFadeToGray")
public fun testPatternColorBarsFadeToGray(block: com.google.jetpackcamera.model.proto.TestPatternColorBarsFadeToGrayKt.Dsl.() -> kotlin.Unit): com.google.jetpackcamera.model.proto.TestPatternColorBarsFadeToGray =
    com.google.jetpackcamera.model.proto.TestPatternColorBarsFadeToGrayKt.Dsl._create(com.google.jetpackcamera.model.proto.TestPatternColorBarsFadeToGray.newBuilder()).apply { block() }._build()
public object TestPatternColorBarsFadeToGrayKt {
    // @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    // @com.google.protobuf.kotlin.ProtoDslMarker
    public class Dsl private constructor(
        private val _builder: com.google.jetpackcamera.model.proto.TestPatternColorBarsFadeToGray.Builder
    ) {
        public companion object {
            // @kotlin.jvm.JvmSynthetic
            // @kotlin.PublishedApi
            internal fun _create(builder: com.google.jetpackcamera.model.proto.TestPatternColorBarsFadeToGray.Builder): Dsl = Dsl(builder)
        }

        // @kotlin.jvm.JvmSynthetic
        // @kotlin.PublishedApi
        internal fun _build(): com.google.jetpackcamera.model.proto.TestPatternColorBarsFadeToGray = _builder.build()
    }
}
public fun com.google.jetpackcamera.model.proto.TestPatternColorBarsFadeToGray.copy(block: com.google.jetpackcamera.model.proto.TestPatternColorBarsFadeToGrayKt.Dsl.() -> kotlin.Unit): com.google.jetpackcamera.model.proto.TestPatternColorBarsFadeToGray =
    com.google.jetpackcamera.model.proto.TestPatternColorBarsFadeToGrayKt.Dsl._create(this.toBuilder()).apply { block() }._build()

