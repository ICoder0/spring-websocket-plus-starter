package com.icoder0.websocket.core.model;import lombok.Data;/** * @author bofa1ex * @since 2020/6/30 */@Datapublic class WsInboundBean implements WsInboundBeanSpecification {    /** 消息序号 */    private Long sequence;    /** 函数枚举 */    private Integer code;    /** 函数入参 */    private String params;    /** 版本号 */    private Long version;    @Override    public Object sequence() {        return sequence;    }    @Override    public Object functionCode() {        return code;    }    @Override    public String params() {        return params;    }}