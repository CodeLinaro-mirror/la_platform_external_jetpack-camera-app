package com.google.jetpackcamera.model.proto

// @kotlin.jvm.JvmName("-initializetestPatternColorBars")
public fun testPatternColorBars(block: com.google.jetpackcamera.model.proto.TestPatternColorBarsKt.Dsl.() -> kotlin.Unit): com.google.jetpackcamera.model.proto.TestPatternColorBars =
    com.google.jetpackcamera.model.proto.TestPatternColorBarsKt.Dsl._create(com.google.jetpackcamera.model.proto.TestPatternColorBars.newBuilder()).apply { block() }._build()
public object TestPatternColorBarsKt {
    // @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    // @com.google.protobuf.kotlin.ProtoDslMarker
    public class Dsl private constructor(
        private val _builder: com.google.jetpackcamera.model.proto.TestPatternColorBars.Builder
    ) {
        public companion object {
            // @kotlin.jvm.JvmSynthetic
            // @kotlin.PublishedApi
            internal fun _create(builder: com.google.jetpackcamera.model.proto.TestPatternColorBars.Builder): Dsl = Dsl(builder)
        }

        // @kotlin.jvm.JvmSynthetic
        // @kotlin.PublishedApi
        internal fun _build(): com.google.jetpackcamera.model.proto.TestPatternColorBars = _builder.build()
    }
}
public fun com.google.jetpackcamera.model.proto.TestPatternColorBars.copy(block: com.google.jetpackcamera.model.proto.TestPatternColorBarsKt.Dsl.() -> kotlin.Unit): com.google.jetpackcamera.model.proto.TestPatternColorBars =
    com.google.jetpackcamera.model.proto.TestPatternColorBarsKt.Dsl._create(this.toBuilder()).apply { block() }._build()

