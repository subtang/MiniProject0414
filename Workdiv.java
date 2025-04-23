/**
 * Package Name : com.pwck.ehr.member.dao <br/>
 * Class Name: Workdiv.java <br/>
 * Description:  <br/>
 * Modification imformation : <br/> 
 * ------------------------------------------<br/>
 * 최초 생성일 : 2025-04-18<br/>
 *
 * ------------------------------------------<br/>
 * @author :user
 * @since  :2024-09-09
 * @version: 0.5
 */
package com.pcwk.ehr.projectcrud;

import java.util.List;

/**
 * 
 */
public interface Workdiv<T> {


	/**
	 * 맛집전체목록 조회
	 * @param dto
	 * @return List<MemberVO>
	 */
	List<T> doRetrieve();
	
	/**
	 * 맛집 단건 조회
	 * @param dto
	 * @return RestaurantVO
	 */
	T doSelctOne(String dto);


	/**
	 * 맛집 정보 삭제 후 저장
	 * @param dto -1, -2(실패)/ 1(성공)
	 */
	int doDelete(String dto);

	/**
	 * 리스트에 있는 데이터 CSV에 저장
	 * @return 0(실패)/ 1(성공)
	 */
	int saveToCSV();
}

 	