package resto.com.app.pojos;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;

@Entity
@Table(name="item_mst")
public class ItemMaster {

	@Id
	@GeneratedValue 
	@Column(name="item_num")	
	private int itemNum;
	
	@Column(name="item_type")
	private String itemType;

	@Column(name="desc")
	private String desc;
	
	@Column(name="uom")
	private int uom;
	
	@Column(name="each_per_case")
	private int eachPerCase;

	@Column(name="sup_id")
	private String supId;

	@Column(name="addon_flg")
	private boolean addonFlg;
	
	@Column(name="sales_flg")
	private boolean salesFlg;
	
	@Column(name="receive_flg")
	private boolean receiveFlg;
	
	
	public String getDesc() {
		return desc;
	}


	public void setDesc(String desc) {
		this.desc = desc;
	}


	public int getUom() {
		return uom;
	}


	public void setUom(int uom) {
		this.uom = uom;
	}


	public int getEachPerCase() {
		return eachPerCase;
	}


	public void setEachPerCase(int eachPerCase) {
		this.eachPerCase = eachPerCase;
	}


	public int getItemNum() {
		return itemNum;
	}


	public void setItemNum(int itemNum) {
		this.itemNum = itemNum;
	}


	public String getItemType() {
		return itemType;
	}


	public void setItemType(String itemType) {
		this.itemType = itemType;
	}


	public String getSupId() {
		return supId;
	}


	public void setSupId(String supId) {
		this.supId = supId;
	}

	public boolean getSalesFlg() {
		return salesFlg;
	}


	public void setSalesFlg(boolean salesFlg) {
		this.salesFlg = salesFlg;
	}


	public boolean getReceiveFlg() {
		return receiveFlg;
	}


	public void setReceiveFlg(boolean receiveFlg) {
		this.receiveFlg = receiveFlg;
	}


	public boolean isAddonFlg() {
		return addonFlg;
	}


	public void setAddonFlg(boolean addonFlg) {
		this.addonFlg = addonFlg;
	}
}
