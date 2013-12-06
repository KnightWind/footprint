package com.bimaweng.footprint.bean;

import java.util.Date;

/**
 * @desc 
 * @author jameswangdfx@gmail.com
 * @date 2013-12-6
 */
public class FootPrint {
	
	private long id;
	
	//经度
	private String longitude;
	
	//纬度
	private String latitude;
	
	//终端唯一编号
	private String termCode;
	
	//足迹形成时间
	private Date printTime;
	
	//文字
	private String words;
	
	//音频
	private String audioPath;

	//视频文件
	private String videoPath;
	
	//图片文件
	private String photoPath;
	
	
	private long  userId;
}
