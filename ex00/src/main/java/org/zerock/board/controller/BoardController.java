package org.zerock.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.board.vo.BoardVO;

import lombok.extern.java.Log;

@Controller
@Log
public class BoardController {
	
	@RequestMapping(value = "/board/list.do")
	public String list() {
		
		log.info("게시판 리스트i"); //정보
		log.warning("게시판 리스트w"); //경고
		
		BoardVO vo = new BoardVO();
		vo.setNo(10);
		log.info(vo.toString());
		
		return "board/list";
	}
}