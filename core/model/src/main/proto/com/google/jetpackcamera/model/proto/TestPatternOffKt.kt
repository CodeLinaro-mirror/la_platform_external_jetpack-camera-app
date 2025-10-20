package com.google.jetpackcamera.model.proto

// @kotlin.jvm.JvmName("-initializetestPatternOff")
public fun testPatternOff(block: com.google.jetpackcamera.model.proto.TestPatternOffKt.Dsl.() -> kotlin.Unit): com.google.jetpackcamera.model.proto.TestPatternOff =
    com.google.jetpackcamera.model.proto.TestPatternOffKt.Dsl._create(com.google.jetpackcamera.model.proto.TestPatternOff.newBuilder()).apply { block() }._build()
public object TestPatternOffKt {
    // @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    // @com.google.protobuf.kotlin.ProtoDslMarker
    public class Dsl private constructor(
        private val _builder: com.google.jetpackcamera.model.proto.TestPatternOff.Builder
    ) {
        public companion object {
            // @kotlin.jvm.JvmSynthetic
            // @kotlin.PublishedApi
            internal fun _create(builder: com.google.jetpackcamera.model.proto.TestPatternOff.Builder): Dsl = Dsl(builder)
        }

        // @kotlin.jvm.JvmSynthetic
        // @kotlin.PublishedApi
        internal fun _build(): com.google.jetpackcamera.model.proto.TestPatternOff = _builder.build()
    }
}
public fun com.google.jetpackcamera.model.proto.TestPatternOff.copy(block: com.google.jetpackcamera.model.proto.TestPatternOffKt.Dsl.() -> kotlin.Unit): com.google.jetpackcamera.model.proto.TestPatternOff =
    com.google.jetpackcamera.model.proto.TestPatternOffKt.Dsl._create(this.toBuilder()).apply { block() }._build()
