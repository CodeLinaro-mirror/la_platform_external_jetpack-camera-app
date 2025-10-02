package com.google.jetpackcamera.model.proto

// @kotlin.jvm.JvmName("-initializetestPatternCustom1")
public fun testPatternCustom1(block: com.google.jetpackcamera.model.proto.TestPatternCustom1Kt.Dsl.() -> kotlin.Unit): com.google.jetpackcamera.model.proto.TestPatternCustom1 =
    com.google.jetpackcamera.model.proto.TestPatternCustom1Kt.Dsl._create(com.google.jetpackcamera.model.proto.TestPatternCustom1.newBuilder()).apply { block() }._build()
public object TestPatternCustom1Kt {
    // @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    // @com.google.protobuf.kotlin.ProtoDslMarker
    public class Dsl private constructor(
        private val _builder: com.google.jetpackcamera.model.proto.TestPatternCustom1.Builder
    ) {
        public companion object {
            // @kotlin.jvm.JvmSynthetic
            // @kotlin.PublishedApi
            internal fun _create(builder: com.google.jetpackcamera.model.proto.TestPatternCustom1.Builder): Dsl = Dsl(builder)
        }

        // @kotlin.jvm.JvmSynthetic
        // @kotlin.PublishedApi
        internal fun _build(): com.google.jetpackcamera.model.proto.TestPatternCustom1 = _builder.build()
    }
}
public fun com.google.jetpackcamera.model.proto.TestPatternCustom1.copy(block: com.google.jetpackcamera.model.proto.TestPatternCustom1Kt.Dsl.() -> kotlin.Unit): com.google.jetpackcamera.model.proto.TestPatternCustom1 =
    com.google.jetpackcamera.model.proto.TestPatternCustom1Kt.Dsl._create(this.toBuilder()).apply { block() }._build()
