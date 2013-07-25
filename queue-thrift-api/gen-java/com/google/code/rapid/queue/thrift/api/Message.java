/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.google.code.rapid.queue.thrift.api;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Message implements org.apache.thrift.TBase<Message, Message._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Message");

  private static final org.apache.thrift.protocol.TField EXCHANGE_FIELD_DESC = new org.apache.thrift.protocol.TField("exchange", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField ROUTER_KEY_FIELD_DESC = new org.apache.thrift.protocol.TField("routerKey", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField BODY_FIELD_DESC = new org.apache.thrift.protocol.TField("body", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField MESSAGE_PROPERTIES_FIELD_DESC = new org.apache.thrift.protocol.TField("messageProperties", org.apache.thrift.protocol.TType.STRUCT, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new MessageStandardSchemeFactory());
    schemes.put(TupleScheme.class, new MessageTupleSchemeFactory());
  }

  public String exchange; // required
  public String routerKey; // required
  public ByteBuffer body; // required
  public MessageProperties messageProperties; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    EXCHANGE((short)1, "exchange"),
    ROUTER_KEY((short)2, "routerKey"),
    BODY((short)3, "body"),
    MESSAGE_PROPERTIES((short)4, "messageProperties");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // EXCHANGE
          return EXCHANGE;
        case 2: // ROUTER_KEY
          return ROUTER_KEY;
        case 3: // BODY
          return BODY;
        case 4: // MESSAGE_PROPERTIES
          return MESSAGE_PROPERTIES;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.EXCHANGE, new org.apache.thrift.meta_data.FieldMetaData("exchange", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ROUTER_KEY, new org.apache.thrift.meta_data.FieldMetaData("routerKey", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.BODY, new org.apache.thrift.meta_data.FieldMetaData("body", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    tmpMap.put(_Fields.MESSAGE_PROPERTIES, new org.apache.thrift.meta_data.FieldMetaData("messageProperties", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, MessageProperties.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Message.class, metaDataMap);
  }

  public Message() {
  }

  public Message(
    String exchange,
    String routerKey,
    ByteBuffer body,
    MessageProperties messageProperties)
  {
    this();
    this.exchange = exchange;
    this.routerKey = routerKey;
    this.body = body;
    this.messageProperties = messageProperties;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Message(Message other) {
    if (other.isSetExchange()) {
      this.exchange = other.exchange;
    }
    if (other.isSetRouterKey()) {
      this.routerKey = other.routerKey;
    }
    if (other.isSetBody()) {
      this.body = org.apache.thrift.TBaseHelper.copyBinary(other.body);
;
    }
    if (other.isSetMessageProperties()) {
      this.messageProperties = new MessageProperties(other.messageProperties);
    }
  }

  public Message deepCopy() {
    return new Message(this);
  }

  @Override
  public void clear() {
    this.exchange = null;
    this.routerKey = null;
    this.body = null;
    this.messageProperties = null;
  }

  public String getExchange() {
    return this.exchange;
  }

  public Message setExchange(String exchange) {
    this.exchange = exchange;
    return this;
  }

  public void unsetExchange() {
    this.exchange = null;
  }

  /** Returns true if field exchange is set (has been assigned a value) and false otherwise */
  public boolean isSetExchange() {
    return this.exchange != null;
  }

  public void setExchangeIsSet(boolean value) {
    if (!value) {
      this.exchange = null;
    }
  }

  public String getRouterKey() {
    return this.routerKey;
  }

  public Message setRouterKey(String routerKey) {
    this.routerKey = routerKey;
    return this;
  }

  public void unsetRouterKey() {
    this.routerKey = null;
  }

  /** Returns true if field routerKey is set (has been assigned a value) and false otherwise */
  public boolean isSetRouterKey() {
    return this.routerKey != null;
  }

  public void setRouterKeyIsSet(boolean value) {
    if (!value) {
      this.routerKey = null;
    }
  }

  public byte[] getBody() {
    setBody(org.apache.thrift.TBaseHelper.rightSize(body));
    return body == null ? null : body.array();
  }

  public ByteBuffer bufferForBody() {
    return body;
  }

  public Message setBody(byte[] body) {
    setBody(body == null ? (ByteBuffer)null : ByteBuffer.wrap(body));
    return this;
  }

  public Message setBody(ByteBuffer body) {
    this.body = body;
    return this;
  }

  public void unsetBody() {
    this.body = null;
  }

  /** Returns true if field body is set (has been assigned a value) and false otherwise */
  public boolean isSetBody() {
    return this.body != null;
  }

  public void setBodyIsSet(boolean value) {
    if (!value) {
      this.body = null;
    }
  }

  public MessageProperties getMessageProperties() {
    return this.messageProperties;
  }

  public Message setMessageProperties(MessageProperties messageProperties) {
    this.messageProperties = messageProperties;
    return this;
  }

  public void unsetMessageProperties() {
    this.messageProperties = null;
  }

  /** Returns true if field messageProperties is set (has been assigned a value) and false otherwise */
  public boolean isSetMessageProperties() {
    return this.messageProperties != null;
  }

  public void setMessagePropertiesIsSet(boolean value) {
    if (!value) {
      this.messageProperties = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case EXCHANGE:
      if (value == null) {
        unsetExchange();
      } else {
        setExchange((String)value);
      }
      break;

    case ROUTER_KEY:
      if (value == null) {
        unsetRouterKey();
      } else {
        setRouterKey((String)value);
      }
      break;

    case BODY:
      if (value == null) {
        unsetBody();
      } else {
        setBody((ByteBuffer)value);
      }
      break;

    case MESSAGE_PROPERTIES:
      if (value == null) {
        unsetMessageProperties();
      } else {
        setMessageProperties((MessageProperties)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case EXCHANGE:
      return getExchange();

    case ROUTER_KEY:
      return getRouterKey();

    case BODY:
      return getBody();

    case MESSAGE_PROPERTIES:
      return getMessageProperties();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case EXCHANGE:
      return isSetExchange();
    case ROUTER_KEY:
      return isSetRouterKey();
    case BODY:
      return isSetBody();
    case MESSAGE_PROPERTIES:
      return isSetMessageProperties();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Message)
      return this.equals((Message)that);
    return false;
  }

  public boolean equals(Message that) {
    if (that == null)
      return false;

    boolean this_present_exchange = true && this.isSetExchange();
    boolean that_present_exchange = true && that.isSetExchange();
    if (this_present_exchange || that_present_exchange) {
      if (!(this_present_exchange && that_present_exchange))
        return false;
      if (!this.exchange.equals(that.exchange))
        return false;
    }

    boolean this_present_routerKey = true && this.isSetRouterKey();
    boolean that_present_routerKey = true && that.isSetRouterKey();
    if (this_present_routerKey || that_present_routerKey) {
      if (!(this_present_routerKey && that_present_routerKey))
        return false;
      if (!this.routerKey.equals(that.routerKey))
        return false;
    }

    boolean this_present_body = true && this.isSetBody();
    boolean that_present_body = true && that.isSetBody();
    if (this_present_body || that_present_body) {
      if (!(this_present_body && that_present_body))
        return false;
      if (!this.body.equals(that.body))
        return false;
    }

    boolean this_present_messageProperties = true && this.isSetMessageProperties();
    boolean that_present_messageProperties = true && that.isSetMessageProperties();
    if (this_present_messageProperties || that_present_messageProperties) {
      if (!(this_present_messageProperties && that_present_messageProperties))
        return false;
      if (!this.messageProperties.equals(that.messageProperties))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(Message other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    Message typedOther = (Message)other;

    lastComparison = Boolean.valueOf(isSetExchange()).compareTo(typedOther.isSetExchange());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExchange()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.exchange, typedOther.exchange);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRouterKey()).compareTo(typedOther.isSetRouterKey());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRouterKey()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.routerKey, typedOther.routerKey);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetBody()).compareTo(typedOther.isSetBody());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBody()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.body, typedOther.body);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMessageProperties()).compareTo(typedOther.isSetMessageProperties());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMessageProperties()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.messageProperties, typedOther.messageProperties);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Message(");
    boolean first = true;

    sb.append("exchange:");
    if (this.exchange == null) {
      sb.append("null");
    } else {
      sb.append(this.exchange);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("routerKey:");
    if (this.routerKey == null) {
      sb.append("null");
    } else {
      sb.append(this.routerKey);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("body:");
    if (this.body == null) {
      sb.append("null");
    } else {
      org.apache.thrift.TBaseHelper.toString(this.body, sb);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("messageProperties:");
    if (this.messageProperties == null) {
      sb.append("null");
    } else {
      sb.append(this.messageProperties);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (messageProperties != null) {
      messageProperties.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class MessageStandardSchemeFactory implements SchemeFactory {
    public MessageStandardScheme getScheme() {
      return new MessageStandardScheme();
    }
  }

  private static class MessageStandardScheme extends StandardScheme<Message> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Message struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // EXCHANGE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.exchange = iprot.readString();
              struct.setExchangeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ROUTER_KEY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.routerKey = iprot.readString();
              struct.setRouterKeyIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // BODY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.body = iprot.readBinary();
              struct.setBodyIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // MESSAGE_PROPERTIES
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.messageProperties = new MessageProperties();
              struct.messageProperties.read(iprot);
              struct.setMessagePropertiesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Message struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.exchange != null) {
        oprot.writeFieldBegin(EXCHANGE_FIELD_DESC);
        oprot.writeString(struct.exchange);
        oprot.writeFieldEnd();
      }
      if (struct.routerKey != null) {
        oprot.writeFieldBegin(ROUTER_KEY_FIELD_DESC);
        oprot.writeString(struct.routerKey);
        oprot.writeFieldEnd();
      }
      if (struct.body != null) {
        oprot.writeFieldBegin(BODY_FIELD_DESC);
        oprot.writeBinary(struct.body);
        oprot.writeFieldEnd();
      }
      if (struct.messageProperties != null) {
        oprot.writeFieldBegin(MESSAGE_PROPERTIES_FIELD_DESC);
        struct.messageProperties.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class MessageTupleSchemeFactory implements SchemeFactory {
    public MessageTupleScheme getScheme() {
      return new MessageTupleScheme();
    }
  }

  private static class MessageTupleScheme extends TupleScheme<Message> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Message struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetExchange()) {
        optionals.set(0);
      }
      if (struct.isSetRouterKey()) {
        optionals.set(1);
      }
      if (struct.isSetBody()) {
        optionals.set(2);
      }
      if (struct.isSetMessageProperties()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetExchange()) {
        oprot.writeString(struct.exchange);
      }
      if (struct.isSetRouterKey()) {
        oprot.writeString(struct.routerKey);
      }
      if (struct.isSetBody()) {
        oprot.writeBinary(struct.body);
      }
      if (struct.isSetMessageProperties()) {
        struct.messageProperties.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Message struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.exchange = iprot.readString();
        struct.setExchangeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.routerKey = iprot.readString();
        struct.setRouterKeyIsSet(true);
      }
      if (incoming.get(2)) {
        struct.body = iprot.readBinary();
        struct.setBodyIsSet(true);
      }
      if (incoming.get(3)) {
        struct.messageProperties = new MessageProperties();
        struct.messageProperties.read(iprot);
        struct.setMessagePropertiesIsSet(true);
      }
    }
  }

}

