package com.google.jetpackcamera.model.proto

// @kotlin.jvm.JvmName("-initializetestPatternPN9")
public fun testPatternPN9(block: com.google.jetpackcamera.model.proto.TestPatternPN9Kt.Dsl.() -> kotlin.Unit): com.google.jetpackcamera.model.proto.TestPatternPN9 =
    com.google.jetpackcamera.model.proto.TestPatternPN9Kt.Dsl._create(com.google.jetpackcamera.model.proto.TestPatternPN9.newBuilder()).apply { block() }._build()
public object TestPatternPN9Kt {
    // @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    // @com.google.protobuf.kotlin.ProtoDslMarker
    public class Dsl private constructor(
        private val _builder: com.google.jetpackcamera.model.proto.TestPatternPN9.Builder
    ) {
        public companion object {
            // @kotlin.jvm.JvmSynthetic
            // @kotlin.PublishedApi
            internal fun _create(builder: com.google.jetpackcamera.model.proto.TestPatternPN9.Builder): Dsl = Dsl(builder)
        }

        // @kotlin.jvm.JvmSynthetic
        // @kotlin.PublishedApi
        internal fun _build(): com.google.jetpackcamera.model.proto.TestPatternPN9 = _builder.build()
    }
}
public fun com.google.jetpackcamera.model.proto.TestPatternPN9.copy(block: com.google.jetpackcamera.model.proto.TestPatternPN9Kt.Dsl.() -> kotlin.Unit): com.google.jetpackcamera.model.proto.TestPatternPN9 =
    com.google.jetpackcamera.model.proto.TestPatternPN9Kt.Dsl._create(this.toBuilder()).apply { block() }._build()
