// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: db.proto

package iiis.systems.os.blockdb;

public interface TransactionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:blockdb.Transaction)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.blockdb.Transaction.Types Type = 1;</code>
   */
  int getTypeValue();
  /**
   * <code>.blockdb.Transaction.Types Type = 1;</code>
   */
  iiis.systems.os.blockdb.Transaction.Types getType();

  /**
   * <pre>
   * Optional
   * </pre>
   *
   * <code>string UserID = 2;</code>
   */
  java.lang.String getUserID();
  /**
   * <pre>
   * Optional
   * </pre>
   *
   * <code>string UserID = 2;</code>
   */
  com.google.protobuf.ByteString
      getUserIDBytes();

  /**
   * <pre>
   * Optional
   * </pre>
   *
   * <code>string FromID = 3;</code>
   */
  java.lang.String getFromID();
  /**
   * <pre>
   * Optional
   * </pre>
   *
   * <code>string FromID = 3;</code>
   */
  com.google.protobuf.ByteString
      getFromIDBytes();

  /**
   * <pre>
   * Optional
   * </pre>
   *
   * <code>string ToID = 4;</code>
   */
  java.lang.String getToID();
  /**
   * <pre>
   * Optional
   * </pre>
   *
   * <code>string ToID = 4;</code>
   */
  com.google.protobuf.ByteString
      getToIDBytes();

  /**
   * <code>int32 Value = 5;</code>
   */
  int getValue();
}
