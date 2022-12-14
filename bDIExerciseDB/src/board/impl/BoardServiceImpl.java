package board.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import board.BoardDao;
import board.BoardService;
import board.vo.BoardVO;

//@Component("boardService") //알아서 객체생성, 메인에서 이름 부여했기때문
@Service("boardService")
public class BoardServiceImpl implements BoardService {
	
	@Autowired      //알아서 주입  
	private BoardDao boardDAO;

	// 메소드오버라이딩 
	@Override
	public void insertBoard(BoardVO vo) {
		boardDAO.insertBoard(vo); //null..이니까 위에 주입
		
	}

	@Override
	public void updateBoard(BoardVO vo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteBoard(BoardVO vo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public BoardVO getBoard(BoardVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BoardVO> getBoardList(BoardVO vo) {
		// TODO Auto-generated method stub
		return null;
	}


	
	

} 