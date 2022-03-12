package com.ilinbun.mulcam.service;

import java.util.List;

import com.ilinbun.mulcam.dto.PageInfo;
import com.ilinbun.mulcam.dto.PlaceRating;
import com.ilinbun.mulcam.dto.PlaceReview;
import com.ilinbun.mulcam.dto.PlaceReviewExtended;

public interface PlaceReviewService {
	
	void writeBoard(PlaceReview pr) throws Exception;
	List<PlaceReviewExtended> getReviewList(int page, PageInfo pageInfo, int id) throws Exception;
	int getReviewAmount(int id) throws Exception;
	
	Double getInteriorRating(int id) throws Exception;
	Double getPriceRating(int id) throws Exception;
	Double getServiceRating(int id) throws Exception;
	Double getTasteRating(int id) throws Exception;
	Double getTotalRating(int id) throws Exception;
	PlaceRating getAllRating(int id) throws Exception;
	Double getHonbabLv(int id) throws Exception;
	
	int updateReview(PlaceReview pr) throws Exception;
	int updateReviewFilePath(PlaceReview pr) throws Exception;
	int deleteReview(int reviewNo) throws Exception;
	
	PlaceReview getReview(int reviewNo) throws Exception;
	
	//마이페이지에 사용자의 리뷰 게시글 출력(준근)
	List<PlaceReview> MyReviewBoard(int idx) throws Exception;
}
