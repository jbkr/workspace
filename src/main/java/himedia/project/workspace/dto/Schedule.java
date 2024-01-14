package himedia.project.workspace.dto;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class Schedule {
	
	Long postNo;		// 문서 번호
	String date;		// 작성일자
	// A. 문서번호로만 기본키 설정
	// B. 문서번호 + 작성일자 기본키 설정
	String writter;		// 작성자
	String title;		// 제목
	String body;		// 내용
}
