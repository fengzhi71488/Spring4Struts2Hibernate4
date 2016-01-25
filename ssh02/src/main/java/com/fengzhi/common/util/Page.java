package com.fengzhi.common.util;

public class Page {

	/** 是否有上一页 */
	private boolean hasPrePage;

	/** 是否有下一页 */
	private boolean hasNextPage;

	/** 每页的数量 */
	private int everyPage;

	/** 总页数 */
	private int totalPage;

	/** 当前页 */
	private int currentPage;

	/** 起始点 */
	private int beginIndex;

	/** 总记录数 */
	private int totalCount;

	/** 开始的页数 */
	private int startPage;

	/** 结束的页数 */
	private int endPage;

	/**
	 * @return totalCount
	 */
	public int getTotalCount() {
		return totalCount;
	}

	/**
	 * @param totalCount
	 */
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public Page() {

	}

	public Page(int everyPage) {
		this.everyPage = everyPage;
	}

	public Page(boolean hasPrePage, boolean hasNextPage, int everyPage, int totalPage, int currentPage, int beginIndex, int totalCount, int startPage, int endPage) {
		this.hasPrePage = hasPrePage;
		this.hasNextPage = hasNextPage;
		this.everyPage = everyPage;
		this.totalPage = totalPage;
		this.currentPage = currentPage;
		this.beginIndex = beginIndex;
		this.totalCount = totalCount;
		this.startPage = startPage;
		this.endPage = endPage;
	}

	public int getBeginIndex() {
		return beginIndex;
	}

	public void setBeginIndex(int beginIndex) {
		this.beginIndex = beginIndex;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getEveryPage() {
		return everyPage;
	}

	public void setEveryPage(int everyPage) {
		this.everyPage = everyPage;
	}

	public boolean getHasNextPage() {
		return hasNextPage;
	}

	public void setHasNextPage(boolean hasNextPage) {
		this.hasNextPage = hasNextPage;
	}

	public boolean getHasPrePage() {
		return hasPrePage;
	}

	public void setHasPrePage(boolean hasPrePage) {
		this.hasPrePage = hasPrePage;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public int getStartPage() {
		return startPage;
	}

	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}

	public int getEndPage() {
		return endPage;
	}

	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}

}
