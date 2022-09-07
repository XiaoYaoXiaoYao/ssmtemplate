package cn.xiaoyao.ssm.pojo;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
    * 订单表
    */
@Data
public class TOrder {
    private Long id;

    /**
    * 用户id
    */
    private Long userId;

    /**
    * 店铺id
    */
    private Long storeId;

    private String orderCode;

    /**
    * 父订单id
    */
    private Long parentId;

    /**
    * 是否父子单（0父单，1子单 2  对应京东商品拆出的子单 3 对应候鸟商品拆出的子单 4 对应网易严选商品拆出的运单子单））
    */
    private Byte isSingle;

    /**
    * 可使用的指定币类型:2 蛋糕币 或 3 鲜花币
    */
    private Byte designationCoin1;

    /**
    * 可使用的指定币类型:4 节日币
    */
    private Byte designationCoin2;

    /**
    * 来源1:4:京东店铺商品  5:网易店铺商品  6:候鸟店铺商品
    */
    private Byte goodsSource;

    /**
    * 交易编号
    */
    private String tradeCode;

    /**
    * 总数量
    */
    private Long total;

    /**
    * 总重量
    */
    private Long totalWeight;

    /**
    * 总金额
    */
    private BigDecimal totalAmount;

    /**
    * 店铺券券id
    */
    private Long storeTicketId;

    /**
    * 店铺券抵扣金额
    */
    private BigDecimal storeTicketAmount;

    /**
    * 促销金额
    */
    private BigDecimal promotionAmount;

    /**
    * 乐虎券id
    */
    private Long lhId;

    /**
    * 乐虎券抵扣金额
    */
    private BigDecimal lhAmount;

    /**
    * 积分抵扣金额
    */
    private BigDecimal deductionAmount;

    /**
    * 订单折扣金额
    */
    private BigDecimal discountAmount;

    /**
    * 福利币金额
    */
    private BigDecimal welfareAmount;

    /**
    * 使用的指定币类别
    */
    private Integer welfareCat;

    /**
    * 商品实际总金额
    */
    private BigDecimal totalGoodsPrice;

    /**
    * 税费总金额
    */
    private BigDecimal totalTaxPrice;

    /**
    * 实际支付价格(含税)
    */
    private BigDecimal totalPrice;

    /**
    * 下单时间
    */
    private Date createTime;

    /**
    * 下单时间戳
    */
    private Long createDatestamp;

    /**
    * 支付方式:0 支付宝  1  积分抵扣  2  银联  3  微信 4便民服务卡,5pos机 ，6优惠券,7-中国银行，8-建设银行  9财付通 10红包抵扣 11积分/乐虎券抵扣（积分+乐虎券一起抵扣）12-红包/乐虎券抵扣 13-积分+红包抵扣 14-积分+红包抵扣+乐虎券 15农行支付 16 瑞祥商联卡支付 17 瑞祥黑金卡支付 18 亿佰嘉聚合支付 19 亿柏嘉微信代付
    */
    private Byte paymentMethod;

    /**
    * 订单状态: 1未付款 2订单待审核 3 待发货 4 待收货 5待评价 6交易完成 7已取消 8待核销 11退货处理中 40 退款处理中 41 已退款 51 已完结 52 已核销 55 部分核销
    */
    private Byte status;

    /**
    * 付款时间
    */
    private Date paymentTime;

    /**
    * 付款时间戳
    */
    private Long paymentDatestamp;

    /**
    * 收获地址ID
    */
    private Long addressId;

    /**
    * 收货人
    */
    private String name;

    /**
    * 手机号
    */
    private String phone;

    /**
    * 省
    */
    private String province;

    /**
    * 市
    */
    private String city;

    /**
    * 区
    */
    private String area;

    /**
    * 镇
    */
    private String town;

    /**
    * 详细地址
    */
    private String address;

    /**
    * 身份证号码
    */
    private String idCardNumber;

    /**
    * 身份证正面图片路径
    */
    private String cardFrontImg;

    /**
    * 身份证背面图片路径
    */
    private String cardBackImg;

    /**
    * 物流运费
    */
    private BigDecimal logisticsFare;

    /**
    * 收货时间
    */
    private Date receiptTime;

    /**
    * 收货时间戳
    */
    private Long receiptDatestamp;

    /**
    * 收货备注
    */
    private String receiptRemark;

    /**
    * 发货人
    */
    private String delivery;

    /**
    * 发货时间
    */
    private Date deliveryTime;

    /**
    * 发货时间戳
    */
    private Long deliveryDatestamp;

    /**
    * 源（0pc端 1安卓端，2点单机端, 3.ios 4 wap端 5 微信端 6 微信小程序）
    */
    private Byte source;

    /**
    * 配送方式(1,门店自提，2 送货上门)
    */
    private Byte shippingMethod;

    /**
    * 论状态 0未评论 1已评论
    */
    private Byte commentsStatus;

    /**
    * 显示状态（0 显示，1 不显示（删除））0:正常所有显示 1;删除状态,回收站显示 2:删除只在后台显示
    */
    private Byte showStatus;

    /**
    * 作废类型:1 管理员操作 2 会员操作取消 3 严选主动取消
    */
    private Byte cancelType;

    /**
    * 运费模板id
    */
    private Long freightId;

    /**
    * 物流公司
    */
    private Long logisticsCompany;

    /**
    * 物流公司代码
    */
    private String logisticsName;

    /**
    * 物流单号
    */
    private String logisticsNumber;

    /**
    * 快递100订阅接口返回数据
    */
    private String kd100Back;

    /**
    * 备注
    */
    private String remarks;

    /**
    * 配送方式(1:快递; 2:门店自提 3:商户配送)
    */
    private Byte deliveryType;

    /**
    * 前台用户选择的送货/提货时间
    */
    private String deliverytime;

    /**
    * 店铺配送时间段id
    */
    private Long deliveryTimeId;

    /**
    * 门店id
    */
    private Long saleroomId;

    /**
    * 价格调整原因
    */
    private String priceexplain;

    /**
    * 使用积分数
    */
    private Long integral;

    private String buyMessage;

    /**
    * 订单类型 ：0普通订单、1换货订单、2退货订单、3拼团订单、11金卡、12白金卡、13钻石卡 21积分充话费 22积分充流量 23积分兑换券 24线下券 25线上券 26实物
    */
    private Byte orderType;

    /**
    * 发货备注
    */
    private String deliveryRemark;

    /**
    * 支付流水号
    */
    private String payTn;

    /**
    * 审核状态 1审核通过 2不通过
    */
    private Byte auditStatus;

    /**
    * 审核时间
    */
    private Date auditTime;

    /**
    * 审核时间戳
    */
    private Long auditTimestamp;

    /**
    * 审核备注
    */
    private String auditRemark;

    /**
    * 取消时间
    */
    private Date cancleTime;

    /**
    * 取消原因
    */
    private String cancleRemark;

    /**
    * 是否已经投诉 0没有 1已经投诉过
    */
    private Byte isComplaint;

    /**
    * 促销类型（0 普通订单，1秒杀，2满减）
    */
    private Byte promotionType;

    /**
    * 是否开票 （1是，2否）
    */
    private Byte billing;

    /**
    * 发票抬头收件人 或者 收货单位名字
    */
    private String invoiceTitle;

    /**
    * 发票明细内容
    */
    private String invoiceContent;

    /**
    * 是否打印清单（1 是，2否）
    */
    private Byte detailedlist;

    /**
    * 对应的退货id
    */
    private Long refundId;

    /**
    * 退货申请时间
    */
    private Date refundApplyTime;

    /**
    * 退货完成时间
    */
    private Date refundAuditTime;

    /**
    * 退款金额
    */
    private BigDecimal refundAmount;

    /**
    * 完成时间（如果用户取消订单则存取消时间）
    */
    private Date finishTime;

    /**
    * 完成时间（如果用户取消订单则存取消时间）戳
    */
    private Long finishDatestamp;

    /**
    * 金力库位
    */
    private String jlLibraryCode;

    /**
    * 网易下单错误信息
    */
    private String jlRetailcode;

    /**
    * 卓志清关信息
    */
    private String declareMsg;

    /**
    * 保留字段2
    */
    private String jlCompanycode;

    /**
    * 保留字段3
    */
    private String jlBorrowbackid;

    /**
    * 卓志海外订单清关状态（0 未清关 1 清关中 2 清关成功  3 清关失败）
    */
    private Byte declareStatus;

    /**
    * 乐享vip卡卡号
    */
    private String cardNo;

    /**
    * 交易完成时间
    */
    private Date transactionTime;

    /**
    * 退款完成时间
    */
    private Date refundFinishTime;

    /**
    * 该订单是否包含京东 网易 候鸟等第三方子单(is_single为1时有效 0非对接第三方订单或直接对应一个订单  1 有若干个对应的第三方子单)
    */
    private Byte hasJdChildren;

    /**
    * 包裹id
    */
    private Long packageId;

    /**
    * 退款福利币
    */
    private BigDecimal refundWelfareAmount;

    /**
    * 指定币金额
    */
    private BigDecimal welfareDesAmount;

    /**
    * 可使用的指定币:2 蛋糕币 或 3 鲜花币 支付金额
    */
    private BigDecimal designationCoin1Amount;

    /**
    * 可使用的指定币:4 节日币 支付金额
    */
    private BigDecimal designationCoin2Amount;

    /**
    * 可使用的指定币:2 蛋糕币 或 3 鲜花币 退款金额
    */
    private BigDecimal refundDesignationCoin1Amount;

    /**
    * 可使用的指定币:4 节日币 退款金额
    */
    private BigDecimal refundDesignationCoin2Amount;

    /**
    * 微信支付金额
    */
    private BigDecimal wxPayAmount;

    /**
    * 自费币金额
    */
    private BigDecimal welfareRecAmount;

    /**
    * 指定币退款金额
    */
    private BigDecimal refundWelfareDesAmount;

    /**
    * 微信退款金额
    */
    private BigDecimal refundWxAmount;

    /**
    * 自费币退款金额
    */
    private BigDecimal refundWelfareRecAmount;
}