
package cn.com.gxt.uac.entity;

import java.io.Serializable;
import org.umeframework.dora.validation.constraints.Size;
import org.umeframework.dora.type.ColumnDesc;
import org.umeframework.dora.validation.constraints.NotEmpty;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Entity;
import org.umeframework.dora.type.TableDesc;
import javax.persistence.Id;
import org.umeframework.dora.bean.BeanUtil;
import org.umeframework.dora.service.TableEntity;

/**
 * Entity class map to table "供销通用户表"
 *
 * @author ume-team
 */
@Entity
@Table(name="GXT_USER")
@TableDesc(label="供销通用户表")
public class GxtUserDto extends TableEntity implements Serializable {
   /**
    * Default serial version code
    */
    private static final long serialVersionUID = 1L;

   /**
    * 用户识别ID 
    */
    @NotEmpty
    @Size(max=16)
    @Id
    @ColumnDesc(index=1, type="VARCHAR", label="用户识别ID")
    @Column(name="USER_ID", nullable=false, length=16)
    private String userId;

   /**
    * 用户收货地址(默认) 
    */
    @Size(max=256)
    @ColumnDesc(index=2, type="VARCHAR", label="用户收货地址(默认)")
    @Column(name="USER_POST_ADDR", nullable=true, length=256)
    private String userPostAddr;

   /**
    * 用户收货地址(备用) 
    * 多个名称的时候用分号“；”分隔
    */
    @Size(max=1024)
    @ColumnDesc(index=3, type="VARCHAR", label="用户收货地址(备用)")
    @Column(name="USER_POST_ADDR_OTHER", nullable=true, length=1024)
    private String userPostAddrOther;

   /**
    * 用户银行账号(默认) 
    */
    @Size(max=32)
    @ColumnDesc(index=4, type="VARCHAR", label="用户银行账号(默认)")
    @Column(name="USER_BANK_ACC_NO", nullable=true, length=32)
    private String userBankAccNo;

   /**
    * 用户银行账号(备用) 
    * 多个名称的时候用分号“；”分隔
    */
    @Size(max=128)
    @ColumnDesc(index=5, type="VARCHAR", label="用户银行账号(备用)")
    @Column(name="USER_BANK_ACC_NO_OTHER", nullable=true, length=128)
    private String userBankAccNoOther;

   /**
    * 用户银行名称(默认) 
    */
    @Size(max=32)
    @ColumnDesc(index=6, type="VARCHAR", label="用户银行名称(默认)")
    @Column(name="USER_BANK_ACC_NAME", nullable=true, length=32)
    private String userBankAccName;

   /**
    * 用户银行名称(备用) 
    * 多个名称的时候用分号“；”分隔
    */
    @Size(max=128)
    @ColumnDesc(index=7, type="VARCHAR", label="用户银行名称(备用)")
    @Column(name="USER_BANK_ACC_NAME_OTHER", nullable=true, length=128)
    private String userBankAccNameOther;

   /**
    * 用户身份证号码 
    */
    @Size(max=32)
    @ColumnDesc(index=8, type="VARCHAR", label="用户身份证号码")
    @Column(name="USER_IDENTITY_CARD", nullable=true, length=32)
    private String userIdentityCard;

   /**
    * 关联微信属性 
    */
    @Size(max=32)
    @ColumnDesc(index=9, type="VARCHAR", label="关联微信属性")
    @Column(name="WECHAT_OPENID", nullable=true, length=32)
    private String wechatOpenid;

   /**
    * 关联微信属性 
    */
    @Size(max=64)
    @ColumnDesc(index=10, type="VARCHAR", label="关联微信属性")
    @Column(name="WECHAT_CITY", nullable=true, length=64)
    private String wechatCity;

   /**
    * 关联微信属性 
    */
    @Size(max=64)
    @ColumnDesc(index=11, type="VARCHAR", label="关联微信属性")
    @Column(name="WECHAT_COUNTRY", nullable=true, length=64)
    private String wechatCountry;

   /**
    * 关联微信属性 
    */
    @Size(max=512)
    @ColumnDesc(index=12, type="VARCHAR", label="关联微信属性")
    @Column(name="WECHAT_HEADIMGURL", nullable=true, length=512)
    private String wechatHeadimgurl;

   /**
    * 关联微信属性 
    */
    @Size(max=64)
    @ColumnDesc(index=13, type="VARCHAR", label="关联微信属性")
    @Column(name="WECHAT_LANGUAGE", nullable=true, length=64)
    private String wechatLanguage;

   /**
    * 关联微信属性 
    */
    @Size(max=1024)
    @ColumnDesc(index=14, type="VARCHAR", label="关联微信属性")
    @Column(name="WECHAT_NICKNAME", nullable=true, length=1024)
    private String wechatNickname;

   /**
    * 关联微信属性 
    */
    @Size(max=64)
    @ColumnDesc(index=15, type="VARCHAR", label="关联微信属性")
    @Column(name="WECHAT_PROVINCE", nullable=true, length=64)
    private String wechatProvince;

   /**
    * 关联微信属性 
    */
    @Size(max=8)
    @ColumnDesc(index=16, type="VARCHAR", label="关联微信属性")
    @Column(name="WECHAT_SEX", nullable=true, length=8)
    private String wechatSex;

   /**
    * 关联微信属性 
    */
    @Size(max=64)
    @ColumnDesc(index=17, type="VARCHAR", label="关联微信属性")
    @Column(name="WECHAT_UNIONID", nullable=true, length=64)
    private String wechatUnionid;

   /**
    * 关联微信属性 
    */
    @Size(max=20)
    @ColumnDesc(index=18, type="VARCHAR", label="关联微信属性")
    @Column(name="WECHAT_PRIVILEGE", nullable=true, length=20)
    private String wechatPrivilege;

   /**
    * 关联微信属性 
    */
    @ColumnDesc(index=19, type="INT", label="关联微信属性")
    @Column(name="WECHAT_GROUPID", nullable=true)
    private Integer wechatGroupid;

   /**
    * 关联微信属性 
    */
    @Size(max=512)
    @ColumnDesc(index=20, type="VARCHAR", label="关联微信属性")
    @Column(name="WECHAT_TAGID_LIST", nullable=true, length=512)
    private String wechatTagidList;

   /**
    * 关联微信属性 
    */
    @ColumnDesc(index=21, type="INT", label="关联微信属性")
    @Column(name="WECHAT_SUBSCRIBE", nullable=true)
    private Integer wechatSubscribe;

   /**
    * 关联微信属性 
    */
    @ColumnDesc(index=22, type="TIMESTAMP", label="关联微信属性")
    @Column(name="WECHAT_SUBSCRIBE_TIME", nullable=true)
    private java.sql.Timestamp wechatSubscribeTime;

   /**
    * Create Author (default setting while insert)
    */
    @ColumnDesc(index=(22 + 1), type="VARCHAR", label="Create Author")
    @Column(name="CREATE_AUTHER", nullable=true, length=32)
    private String createAuthor;
   /**
    * Create Datetime (default setting while insert)
    */
    @ColumnDesc(index=(22 + 2), type="TIMESTAMP", label="Create Datetime")
    @Column(name="CREATE_DATETIME", nullable=true)
    private java.sql.Timestamp createDatetime;
   /**
    * Update Author (refresh on each update)
    */
    @ColumnDesc(index=(22 + 3), type="VARCHAR", label="Update Author")
    @Column(name="UPDATE_AUTHER", nullable=true, length=32)
    private String updateAuthor;
   /**
    * Update Datetime (refresh on each update)
    */
    @ColumnDesc(index=(22 + 4), type="TIMESTAMP", label="Update Datetime")
    @Column(name="UPDATE_DATETIME", nullable=true)
    private java.sql.Timestamp updateDatetime;

    /**
     *　Get the "用户识别ID"
     */
    public String getUserId() {
        return this.userId;
    }
    /**
     *　Set the "用户识别ID"
     */
    public void setUserId(
            String userId) {
        this.userId = userId;
    }

    /**
     *　Get the "用户收货地址(默认)"
     */
    public String getUserPostAddr() {
        return this.userPostAddr;
    }
    /**
     *　Set the "用户收货地址(默认)"
     */
    public void setUserPostAddr(
            String userPostAddr) {
        this.userPostAddr = userPostAddr;
    }

    /**
     *　Get the "用户收货地址(备用)"
     */
    public String getUserPostAddrOther() {
        return this.userPostAddrOther;
    }
    /**
     *　Set the "用户收货地址(备用)"
     */
    public void setUserPostAddrOther(
            String userPostAddrOther) {
        this.userPostAddrOther = userPostAddrOther;
    }

    /**
     *　Get the "用户银行账号(默认)"
     */
    public String getUserBankAccNo() {
        return this.userBankAccNo;
    }
    /**
     *　Set the "用户银行账号(默认)"
     */
    public void setUserBankAccNo(
            String userBankAccNo) {
        this.userBankAccNo = userBankAccNo;
    }

    /**
     *　Get the "用户银行账号(备用)"
     */
    public String getUserBankAccNoOther() {
        return this.userBankAccNoOther;
    }
    /**
     *　Set the "用户银行账号(备用)"
     */
    public void setUserBankAccNoOther(
            String userBankAccNoOther) {
        this.userBankAccNoOther = userBankAccNoOther;
    }

    /**
     *　Get the "用户银行名称(默认)"
     */
    public String getUserBankAccName() {
        return this.userBankAccName;
    }
    /**
     *　Set the "用户银行名称(默认)"
     */
    public void setUserBankAccName(
            String userBankAccName) {
        this.userBankAccName = userBankAccName;
    }

    /**
     *　Get the "用户银行名称(备用)"
     */
    public String getUserBankAccNameOther() {
        return this.userBankAccNameOther;
    }
    /**
     *　Set the "用户银行名称(备用)"
     */
    public void setUserBankAccNameOther(
            String userBankAccNameOther) {
        this.userBankAccNameOther = userBankAccNameOther;
    }

    /**
     *　Get the "用户身份证号码"
     */
    public String getUserIdentityCard() {
        return this.userIdentityCard;
    }
    /**
     *　Set the "用户身份证号码"
     */
    public void setUserIdentityCard(
            String userIdentityCard) {
        this.userIdentityCard = userIdentityCard;
    }

    /**
     *　Get the "关联微信属性"
     */
    public String getWechatOpenid() {
        return this.wechatOpenid;
    }
    /**
     *　Set the "关联微信属性"
     */
    public void setWechatOpenid(
            String wechatOpenid) {
        this.wechatOpenid = wechatOpenid;
    }

    /**
     *　Get the "关联微信属性"
     */
    public String getWechatCity() {
        return this.wechatCity;
    }
    /**
     *　Set the "关联微信属性"
     */
    public void setWechatCity(
            String wechatCity) {
        this.wechatCity = wechatCity;
    }

    /**
     *　Get the "关联微信属性"
     */
    public String getWechatCountry() {
        return this.wechatCountry;
    }
    /**
     *　Set the "关联微信属性"
     */
    public void setWechatCountry(
            String wechatCountry) {
        this.wechatCountry = wechatCountry;
    }

    /**
     *　Get the "关联微信属性"
     */
    public String getWechatHeadimgurl() {
        return this.wechatHeadimgurl;
    }
    /**
     *　Set the "关联微信属性"
     */
    public void setWechatHeadimgurl(
            String wechatHeadimgurl) {
        this.wechatHeadimgurl = wechatHeadimgurl;
    }

    /**
     *　Get the "关联微信属性"
     */
    public String getWechatLanguage() {
        return this.wechatLanguage;
    }
    /**
     *　Set the "关联微信属性"
     */
    public void setWechatLanguage(
            String wechatLanguage) {
        this.wechatLanguage = wechatLanguage;
    }

    /**
     *　Get the "关联微信属性"
     */
    public String getWechatNickname() {
        return this.wechatNickname;
    }
    /**
     *　Set the "关联微信属性"
     */
    public void setWechatNickname(
            String wechatNickname) {
        this.wechatNickname = wechatNickname;
    }

    /**
     *　Get the "关联微信属性"
     */
    public String getWechatProvince() {
        return this.wechatProvince;
    }
    /**
     *　Set the "关联微信属性"
     */
    public void setWechatProvince(
            String wechatProvince) {
        this.wechatProvince = wechatProvince;
    }

    /**
     *　Get the "关联微信属性"
     */
    public String getWechatSex() {
        return this.wechatSex;
    }
    /**
     *　Set the "关联微信属性"
     */
    public void setWechatSex(
            String wechatSex) {
        this.wechatSex = wechatSex;
    }

    /**
     *　Get the "关联微信属性"
     */
    public String getWechatUnionid() {
        return this.wechatUnionid;
    }
    /**
     *　Set the "关联微信属性"
     */
    public void setWechatUnionid(
            String wechatUnionid) {
        this.wechatUnionid = wechatUnionid;
    }

    /**
     *　Get the "关联微信属性"
     */
    public String getWechatPrivilege() {
        return this.wechatPrivilege;
    }
    /**
     *　Set the "关联微信属性"
     */
    public void setWechatPrivilege(
            String wechatPrivilege) {
        this.wechatPrivilege = wechatPrivilege;
    }

    /**
     *　Get the "关联微信属性"
     */
    public Integer getWechatGroupid() {
        return this.wechatGroupid;
    }
    /**
     *　Set the "关联微信属性"
     */
    public void setWechatGroupid(
            Integer wechatGroupid) {
        this.wechatGroupid = wechatGroupid;
    }

    /**
     *　Get the "关联微信属性"
     */
    public String getWechatTagidList() {
        return this.wechatTagidList;
    }
    /**
     *　Set the "关联微信属性"
     */
    public void setWechatTagidList(
            String wechatTagidList) {
        this.wechatTagidList = wechatTagidList;
    }

    /**
     *　Get the "关联微信属性"
     */
    public Integer getWechatSubscribe() {
        return this.wechatSubscribe;
    }
    /**
     *　Set the "关联微信属性"
     */
    public void setWechatSubscribe(
            Integer wechatSubscribe) {
        this.wechatSubscribe = wechatSubscribe;
    }

    /**
     *　Get the "关联微信属性"
     */
    public java.sql.Timestamp getWechatSubscribeTime() {
        return this.wechatSubscribeTime;
    }
    /**
     *　Set the "关联微信属性"
     */
    public void setWechatSubscribeTime(
            java.sql.Timestamp wechatSubscribeTime) {
        this.wechatSubscribeTime = wechatSubscribeTime;
    }

    /**
     * Get the "Create Auther"
     */
    public String getCreateAuthor() {
        return createAuthor;
    }
    /**
     * Set the "Create Auther"
     */
    public void setCreateAuthor(
            String createAuthor) {
        this.createAuthor = createAuthor;
    }

    /**
     * Get the "Create Datetime"
     */
    public java.sql.Timestamp getCreateDatetime() {
        return createDatetime;
    }
    /**
     * Set the "Create Datetime"
     */
    public void setCreateDatetime(
            java.sql.Timestamp createDatetime) {
        this.createDatetime = createDatetime;
    }

    /**
     * Get the "Update Auther"
     */
    public String getUpdateAuthor() {
        return updateAuthor;
    }
    /**
     * Set the "Update Auther"
     */
    public void setUpdateAuthor(
            String updateAuthor) {
        this.updateAuthor = updateAuthor;
    }

    /**
     * Get the "Update Datetime"
     */
    public java.sql.Timestamp getUpdateDatetime() {
        return updateDatetime;
    }
    /**
     * Set the "Update Datetime"
     */
    public void setUpdateDatetime(
            java.sql.Timestamp updateDatetime) {
        this.updateDatetime = updateDatetime;
    }

    /**
     * Create bean instance copy with selected properties
     * 
     * @param selectProperties
     *            - properties which copy to new instance
     * @return
     */
    public GxtUserDto copyFrom(
            Property... selectProperties) {
        if (selectProperties == null) {
            return null;
        }
        GxtUserDto newInstance = new GxtUserDto();
        for (Property property : selectProperties) {
            String name = property.toString();
            Object value = BeanUtil.getBeanProperty(this, name);
            BeanUtil.setBeanProperty(newInstance, name, value);
        }
        return newInstance;
    }
    
    /**
     * Constant declare: SQL ID in config file
     */
    public static class SQLID {
        public static final String INSERT = "cn.com.gxt.uac.entity.GXT_USER_INSERT"; 
        public static final String UPDATE = "cn.com.gxt.uac.entity.GXT_USER_UPDATE"; 
        public static final String SMART_UPDATE = "cn.com.gxt.uac.entity.GXT_USER_SMART_UPDATE"; 
        public static final String DELETE = "cn.com.gxt.uac.entity.GXT_USER_DELETE"; 
        public static final String FIND = "cn.com.gxt.uac.entity.GXT_USER_FIND"; 
        public static final String FIND_FOR_UPDATE = "cn.com.gxt.uac.entity.GXT_USER_FIND_FOR_UPDATE"; 
        public static final String SEARCH = "cn.com.gxt.uac.entity.GXT_USER_SEARCH"; 
        public static final String LIKE_SEARCH = "cn.com.gxt.uac.entity.GXT_USER_LIKE_SEARCH"; 
        public static final String DYNA_SEARCH = "cn.com.gxt.uac.entity.GXT_USER_DYNA_SEARCH"; 
        public static final String COUNT = "cn.com.gxt.uac.entity.GXT_USER_COUNT";
    } 

    /**
     * Constant declare: entity property name.<br>
     */
    public static class Property {
        public static final String userId = "userId";
        public static final String userPostAddr = "userPostAddr";
        public static final String userPostAddrOther = "userPostAddrOther";
        public static final String userBankAccNo = "userBankAccNo";
        public static final String userBankAccNoOther = "userBankAccNoOther";
        public static final String userBankAccName = "userBankAccName";
        public static final String userBankAccNameOther = "userBankAccNameOther";
        public static final String userIdentityCard = "userIdentityCard";
        public static final String wechatOpenid = "wechatOpenid";
        public static final String wechatCity = "wechatCity";
        public static final String wechatCountry = "wechatCountry";
        public static final String wechatHeadimgurl = "wechatHeadimgurl";
        public static final String wechatLanguage = "wechatLanguage";
        public static final String wechatNickname = "wechatNickname";
        public static final String wechatProvince = "wechatProvince";
        public static final String wechatSex = "wechatSex";
        public static final String wechatUnionid = "wechatUnionid";
        public static final String wechatPrivilege = "wechatPrivilege";
        public static final String wechatGroupid = "wechatGroupid";
        public static final String wechatTagidList = "wechatTagidList";
        public static final String wechatSubscribe = "wechatSubscribe";
        public static final String wechatSubscribeTime = "wechatSubscribeTime";
        public static final String createAuthor = "createAuthor";
        public static final String createDatetime = "createDatetime";
        public static final String updateAuthor = "updateAuthor";
        public static final String updateDatetime = "updateDatetime";
    }
    
    /**
     * Constant declare: column name map with bean property.<br>
     */
    public static class ColumnName {
        public static final String USER_ID = "USER_ID";
        public static final String USER_POST_ADDR = "USER_POST_ADDR";
        public static final String USER_POST_ADDR_OTHER = "USER_POST_ADDR_OTHER";
        public static final String USER_BANK_ACC_NO = "USER_BANK_ACC_NO";
        public static final String USER_BANK_ACC_NO_OTHER = "USER_BANK_ACC_NO_OTHER";
        public static final String USER_BANK_ACC_NAME = "USER_BANK_ACC_NAME";
        public static final String USER_BANK_ACC_NAME_OTHER = "USER_BANK_ACC_NAME_OTHER";
        public static final String USER_IDENTITY_CARD = "USER_IDENTITY_CARD";
        public static final String WECHAT_OPENID = "WECHAT_OPENID";
        public static final String WECHAT_CITY = "WECHAT_CITY";
        public static final String WECHAT_COUNTRY = "WECHAT_COUNTRY";
        public static final String WECHAT_HEADIMGURL = "WECHAT_HEADIMGURL";
        public static final String WECHAT_LANGUAGE = "WECHAT_LANGUAGE";
        public static final String WECHAT_NICKNAME = "WECHAT_NICKNAME";
        public static final String WECHAT_PROVINCE = "WECHAT_PROVINCE";
        public static final String WECHAT_SEX = "WECHAT_SEX";
        public static final String WECHAT_UNIONID = "WECHAT_UNIONID";
        public static final String WECHAT_PRIVILEGE = "WECHAT_PRIVILEGE";
        public static final String WECHAT_GROUPID = "WECHAT_GROUPID";
        public static final String WECHAT_TAGID_LIST = "WECHAT_TAGID_LIST";
        public static final String WECHAT_SUBSCRIBE = "WECHAT_SUBSCRIBE";
        public static final String WECHAT_SUBSCRIBE_TIME = "WECHAT_SUBSCRIBE_TIME";
        public static final String CREATE_AUTHOR = "CREATE_AUTHOR";
        public static final String CREATE_DATETIME = "CREATE_DATETIME";
        public static final String UPDATE_AUTHOR = "UPDATE_AUTHOR";
        public static final String UPDATE_DATETIME = "UPDATE_DATETIME";
    }
    /**
     * Constant declare: table name.<br>
     */
    public static String TableName = "GXT_USER";

}
