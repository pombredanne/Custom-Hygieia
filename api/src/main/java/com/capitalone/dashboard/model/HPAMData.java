package com.capitalone.dashboard.model;

import java.util.ArrayList;
import java.util.List;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection= "hpamdata")
public class HPAMData extends BaseModel{
	
	HPAMData(){
		
	}
	
	private List<HPAMRBurn> hpamRBurn = new ArrayList<>();
	private List<HPAMRelease> hpamRelease = new ArrayList<>();
	private List<HPAMFeature> hpamFeature = new ArrayList<>();
	
	public List<HPAMRBurn> getHpamRBurn() {
		return hpamRBurn;
	}
	public void setHpamRBurn(List<HPAMRBurn> hpamRBurn) {
		this.hpamRBurn = hpamRBurn;
	}
	public List<HPAMFeature> getHpamFeature() {
		return hpamFeature;
	}
	public void setHpamFeature(List<HPAMFeature> hpamFeature) {
		this.hpamFeature = hpamFeature;
	}
	public List<HPAMRelease> getHpamRelease() {
		return hpamRelease;
	}
	public void setHpamRelease(List<HPAMRelease> hpamRelease) {
		this.hpamRelease = hpamRelease;
	}
	
	public HPAMData(List<HPAMRBurn> hpamRBurn,
					List<HPAMFeature> hpamFeature,
			    	List<HPAMRelease> hpamRelease)
					 {
		super();
		this.hpamRBurn= hpamRBurn;
		this.hpamFeature= hpamFeature;
		this.hpamRelease = hpamRelease;
		
	}
	
	@Override
	public String toString() {
		return "hpamFeature=" + hpamFeature +
			   "hpamRBurn=" + hpamRBurn+
			   "hpamRelease=" + hpamRelease;
			   
	}
}
