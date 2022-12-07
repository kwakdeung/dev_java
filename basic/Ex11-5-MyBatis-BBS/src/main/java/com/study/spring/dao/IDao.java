package com.study.spring.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;

import com.study.spring.dto.ContentDto;

public interface IDao
{
	public ArrayList<ContentDto> listDao();
	public void writeDao(String bName, String bTitle, String bContent);
	public ContentDto content_viewDao(String strID);
	public void upHitDao(String strID);
	public void deleteDao(String bId);
	public void modifyDao(String bId, String bName, String bTitle, String bContent);
	public ContentDto reply_viewDao(String strID);
	public void replyDao(String bName, String bTitle, String bContent, 
			String bGroup, String bStep, String bIndent);
	public void replyShapeDao(String strGroup, String strStep);
	
}
