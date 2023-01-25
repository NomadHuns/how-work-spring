package controller;

import java.util.List;

import config.Model;
import model.Board;
import model.BoardRepository;

public class BoardController {
	
	private final BoardRepository boardRepository;
	
	public BoardController(BoardRepository boardRepository) {
		this.boardRepository = boardRepository;
	}

	public String list(Model model) {
		System.out.println("list 요청됨");
		List<Board> boardList = boardRepository.findAll();
		model.addAttribude("boardList", boardList);
		return "board/list";
	}
	
	public String detail(Model model) {
		System.out.println("detail 요청됨");
		Board board = boardRepository.findById(1);
		model.addAttribude("board", board);
		return "board/detail";
	}
}
