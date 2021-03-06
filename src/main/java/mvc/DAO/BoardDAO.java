package mvc.DAO;

import java.util.List;

import mvc.DTO.Board;
import mvc.DTO.Photo;

public interface BoardDAO {
	
	public List getBoardList();
	
	public Board getBoardView();
	
	public void boardWrite();
	
	public void boardMod();
	
	public void boardDelete();
	
	public List getNoticeList();
	
	public Board getNoticeView();
	
	public void noticeWrite();
	
	public void noticeMod();
	
	public void noticeDelete();
	
	public List getPhotoList();
	
	public Photo getPhotoView();
	
	public void photoUpload();
	
	public void photoDelete();
	
	public void updateRecommend();
	
	public List getComments();
	
}
