// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ClientService.proto

package org.minbox.framework.message.pipe.core.grpc.proto;

public interface ClientHeartBeatRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:org.minbox.framework.message.pipe.core.grpc.proto.ClientHeartBeatRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string address = 1;</code>
   */
  String getAddress();
  /**
   * <code>string address = 1;</code>
   */
  com.google.protobuf.ByteString
      getAddressBytes();

  /**
   * <code>int32 port = 2;</code>
   */
  int getPort();
}