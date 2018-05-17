package mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import mvc.DAO.BoardDAO;
import mvc.DTO.Board;
import mvc.DTO.Photo;

public class BoardServiceImpl implements BoardService{
	
	@Autowired BoardDAO dao;

	@Override
	public List getBoardList() {
		return dao.getBoardList();
	}

	@Override
	public Board getBoardView() {
		return dao.getBoardView();
	}

	@Override
	public void boardWrite() {
		dao.boardWrite();
	}

	@Override
	public void boardMod() {
		dao.boardMod();
	}

	@Override
	public void boardDelete() {
		dao.boardDelete();
	}

	@Override
	public List getNoticeList() {
		return dao.getNoticeList();
	}

	@Override
	public Board getNoticeView() {
		return dao.getNoticeView();
	}

	@Override
	public void noticeWrite() {
		dao.noticeWrite();
	}

	@Override
	public void noticeMod() {
		dao.noticeMod();
	}

	@Override
	public void noticeDelete() {
		dao.noticeDelete();
	}

	@Override
	public List getPhotoList() {
		return dao.getPhotoList();
	}

	@Override
	public Photo getPhotoView() {
		return dao.getPhotoView();
	}

	@Override
	public void photoUpload() {
		dao.photoUpload();
	}

	@Override
	public void photoDelete() {
		dao.photoDelete();
	}
	
	@Override
	public void updateRecommend() {
		dao.updateRecommend();
	}

	@Override
	public List getComments() {
		return dao.getComments();
	}

}
