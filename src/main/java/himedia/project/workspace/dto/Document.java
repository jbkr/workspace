package himedia.project.workspace.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * @author 김주원
 * @see 작성완료 231221
 */
@Setter @Getter
public class Document {
	//문서 조회용
	Long docNo;						// 문서 번호
	Long empNo;						// 작성자 사번
	String title;					// 문서 제목
	String body;					// 문서 내용
	String name;					// 직원 이름 - 글쓴이
	String status;					// 문서 상태 - 결재진행중, 결재반려됨, 결재완료됨
	String attachedFileName; 		// 첨부파일명
	String attachedFile;			// 첨부파일 정보
	int line;						// 결재 라인
	String firstApproverName;		// 1차 결재 승인자 이름 - 상세페이지 데이터 출력용
	String secondApproverName;		// 2차 결재 승인자 이름 - 상세페이지 데이터 출력용
	String thirdApproverName;		// 3차 결재 승인자 이름 - 상세페이지 데이터 출력용
	// TODO:: 231224 추가
	int firstApproverNo;			// 1차 결재 승인자 사번			
	int secondApproverNo;			// 2차 결재 승인자 사번
	int thirdApproverNo;			// 3차 결재 승인자 사번
	// TODO:: 231230 추가
	int firstApproverPositionNo;	// 1차 결재 승인자 직위 번호
	int secondApproverPositionNo;	// 2차 결재 승인자 직위 번호
	int thirdApproverPositionNo;	// 3차 결재 승인자 직위 번호
	String useYn;					// 사용 여부 (y= 사용중, n=삭제예정)
	// TODO:: 231229 추가 - 노윤건
	String returnComment;			// 반려 의견
}
