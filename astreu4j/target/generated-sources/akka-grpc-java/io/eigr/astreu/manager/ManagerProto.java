// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: astreu/core/protocol/manager/manager.proto

package io.eigr.astreu.manager;

public final class ManagerProto {
  private ManagerProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_astreu_core_protocol_manager_Topic_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_astreu_core_protocol_manager_Topic_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_astreu_core_protocol_manager_TopicInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_astreu_core_protocol_manager_TopicInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_astreu_core_protocol_manager_TopicInfo_PropertiesEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_astreu_core_protocol_manager_TopicInfo_PropertiesEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n*astreu/core/protocol/manager/manager.p" +
      "roto\022\034astreu.core.protocol.manager\032\033goog" +
      "le/protobuf/empty.proto\032\037google/protobuf" +
      "/timestamp.proto\"\025\n\005Topic\022\014\n\004name\030\001 \001(\t\"" +
      "\324\001\n\tTopicInfo\022\n\n\002id\030\001 \001(\t\022\014\n\004size\030\002 \001(\004\022" +
      "K\n\nproperties\030\003 \003(\01327.astreu.core.protoc" +
      "ol.manager.TopicInfo.PropertiesEntry\022-\n\t" +
      "createdAt\030\004 \001(\0132\032.google.protobuf.Timest" +
      "amp\0321\n\017PropertiesEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005v" +
      "alue\030\002 \001(\t:\0028\0012\207\002\n\014TopicService\022V\n\004Info\022" +
      "#.astreu.core.protocol.manager.Topic\032\'.a" +
      "streu.core.protocol.manager.TopicInfo\"\000\022" +
      "E\n\004Drop\022#.astreu.core.protocol.manager.T" +
      "opic\032\026.google.protobuf.Empty\"\000\022X\n\006Create" +
      "\022#.astreu.core.protocol.manager.Topic\032\'." +
      "astreu.core.protocol.manager.TopicInfo\"\000" +
      "BC\n\026io.eigr.astreu.managerB\014ManagerProto" +
      "H\001P\001\252\002\026Io.Eigr.Astreu.Managerb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_astreu_core_protocol_manager_Topic_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_astreu_core_protocol_manager_Topic_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_astreu_core_protocol_manager_Topic_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_astreu_core_protocol_manager_TopicInfo_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_astreu_core_protocol_manager_TopicInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_astreu_core_protocol_manager_TopicInfo_descriptor,
        new java.lang.String[] { "Id", "Size", "Properties", "CreatedAt", });
    internal_static_astreu_core_protocol_manager_TopicInfo_PropertiesEntry_descriptor =
      internal_static_astreu_core_protocol_manager_TopicInfo_descriptor.getNestedTypes().get(0);
    internal_static_astreu_core_protocol_manager_TopicInfo_PropertiesEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_astreu_core_protocol_manager_TopicInfo_PropertiesEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
