package com.nutzfw.core.plugin.flowable.constant;

/**
 * @author huchuc@vip.qq.com
 * @date: 2019/4/22
 * 描述此类：
 */
public class FlowConstant {
    /**
     * 流程提交者-可以在后面流程中驳回重新办理
     */
    public static final String SUBMITTER                              = "FLOW_SUBMITTER";
    /**
     * 流程提交者的部门
     */
    public static final String SUBMITTER_DEPT_ID                      = "FLOW_SUBMITTER_DEPT_ID";
    /**
     * 流程提交者当前拥有的角色
     */
    public static final String SUBMITTER_ROLE_CODES                   = "FLOW_SUBMITTER_ROLE_CODES";
    /**
     * 自由选择的下一步审核人
     */
    public static final String NEXT_REVIEWER                          = "FLOW_NEXT_REVIEWER";
    /**
     * 流程标题
     */
    public static final String PROCESS_TITLE                          = "processTitle";
    /**
     * 流程审核状态-同意\拒绝
     */
    public static final String AUDIT_PASS                             = "auditPass";
    /**
     * 手写签字文件名
     */
    public static final String HAND_WRITING_SIGNATURE_ATTACHMENT_NAME = "手写签字";
    /**
     * 表单数据
     */
    public static final String FORM_DATA                              = "formData";
    /**
     * 未分类流程
     */
    public static final String DEFAULT_CATEGORY                       = "default";
    /**
     * 业务表主键
     */
    public static final String PRIMARY_KEY                            = "id";
}