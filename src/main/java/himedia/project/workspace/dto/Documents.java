package himedia.project.workspace.dto;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class Documents {
	
	// 문서 저장용
	
	Long docNo;							// 문서 번호
	Long empNo;							// 사번
	String title;						// 문서 제목
	String body;						// 문서 내용
	String status;						// 문서 상태 - 결재진행중, 결재반려됨, 결재완료됨
	String attachedFile;				// 첨부파일 정보
	String attachedFileName;			// 첨부파일명
	// TODO:: 231227 추가
	String originAttachedFileUseYn;  	// 기존 첨부파일 사용 여부
	int line;							// 결재 라인
	String name;						// 직원 이름 - 글쓴이
	String position;					// 직위
	// 231223 추가
	String department;					// 부서
	String icon;						// 아이콘 이미지
	// TODO:: 231221 추가 1차 결재 승인자 사번, 2차 결재 승인자 사번, 3차 결재 승인자 사번
	int firstApproverNo;				// 1차 결재 승인자 사번			
	int secondApproverNo;				// 2차 결재 승인자 사번
	int thirdApproverNo;				// 3차 결재 승인자 사번
	
	// TODO:: 231228 추가 - 노윤건
	String returnComment;		// 반려 의견
	// 231230 추가
	String email;						// 이메일
	String phone;						// 내선번호
}
