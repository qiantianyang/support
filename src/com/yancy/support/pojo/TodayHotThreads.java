package com.yancy.support.pojo;

import java.sql.Timestamp;

/**
 * TodayHotThreads entity. @author MyEclipse Persistence Tools
 */

public class TodayHotThreads implements java.io.Serializable {

	// Fields

	private Integer id;
	private String scope;
	private String threadId;
	private String topic;
	private Integer minute;
	private Integer hour;
	private Integer day;
	private Integer month;
	private Integer year;
	private Integer siteId;
	private String siteName;
	private String media;
	private Timestamp date;
	private String title;
	private String url;
	private Integer period;
	private Long posts;
	private Long postsInRange;
	private Long positive;
	private Long negative;
	private Long neutral;
	private Long positiveInRange;
	private Long negativeInRange;
	private Long neutralInRange;
	private Double relevance;
	private Integer reposts;
	private Integer comments;
	private Timestamp updated;
	private Boolean filtered;
	private String repostTo;

	// Constructors

	/** default constructor */
	public TodayHotThreads() {
	}

	/** full constructor */
	public TodayHotThreads(String scope, String threadId, String topic,
			Integer minute, Integer hour, Integer day, Integer month,
			Integer year, Integer siteId, String siteName, String media,
			Timestamp date, String title, String url, Integer period,
			Long posts, Long postsInRange, Long positive, Long negative,
			Long neutral, Long positiveInRange, Long negativeInRange,
			Long neutralInRange, Double relevance, Integer reposts,
			Integer comments, Timestamp updated, Boolean filtered,
			String repostTo) {
		this.scope = scope;
		this.threadId = threadId;
		this.topic = topic;
		this.minute = minute;
		this.hour = hour;
		this.day = day;
		this.month = month;
		this.year = year;
		this.siteId = siteId;
		this.siteName = siteName;
		this.media = media;
		this.date = date;
		this.title = title;
		this.url = url;
		this.period = period;
		this.posts = posts;
		this.postsInRange = postsInRange;
		this.positive = positive;
		this.negative = negative;
		this.neutral = neutral;
		this.positiveInRange = positiveInRange;
		this.negativeInRange = negativeInRange;
		this.neutralInRange = neutralInRange;
		this.relevance = relevance;
		this.reposts = reposts;
		this.comments = comments;
		this.updated = updated;
		this.filtered = filtered;
		this.repostTo = repostTo;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getScope() {
		return this.scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	public String getThreadId() {
		return this.threadId;
	}

	public void setThreadId(String threadId) {
		this.threadId = threadId;
	}

	public String getTopic() {
		return this.topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public Integer getMinute() {
		return this.minute;
	}

	public void setMinute(Integer minute) {
		this.minute = minute;
	}

	public Integer getHour() {
		return this.hour;
	}

	public void setHour(Integer hour) {
		this.hour = hour;
	}

	public Integer getDay() {
		return this.day;
	}

	public void setDay(Integer day) {
		this.day = day;
	}

	public Integer getMonth() {
		return this.month;
	}

	public void setMonth(Integer month) {
		this.month = month;
	}

	public Integer getYear() {
		return this.year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public Integer getSiteId() {
		return this.siteId;
	}

	public void setSiteId(Integer siteId) {
		this.siteId = siteId;
	}

	public String getSiteName() {
		return this.siteName;
	}

	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}

	public String getMedia() {
		return this.media;
	}

	public void setMedia(String media) {
		this.media = media;
	}

	public Timestamp getDate() {
		return this.date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Integer getPeriod() {
		return this.period;
	}

	public void setPeriod(Integer period) {
		this.period = period;
	}

	public Long getPosts() {
		return this.posts;
	}

	public void setPosts(Long posts) {
		this.posts = posts;
	}

	public Long getPostsInRange() {
		return this.postsInRange;
	}

	public void setPostsInRange(Long postsInRange) {
		this.postsInRange = postsInRange;
	}

	public Long getPositive() {
		return this.positive;
	}

	public void setPositive(Long positive) {
		this.positive = positive;
	}

	public Long getNegative() {
		return this.negative;
	}

	public void setNegative(Long negative) {
		this.negative = negative;
	}

	public Long getNeutral() {
		return this.neutral;
	}

	public void setNeutral(Long neutral) {
		this.neutral = neutral;
	}

	public Long getPositiveInRange() {
		return this.positiveInRange;
	}

	public void setPositiveInRange(Long positiveInRange) {
		this.positiveInRange = positiveInRange;
	}

	public Long getNegativeInRange() {
		return this.negativeInRange;
	}

	public void setNegativeInRange(Long negativeInRange) {
		this.negativeInRange = negativeInRange;
	}

	public Long getNeutralInRange() {
		return this.neutralInRange;
	}

	public void setNeutralInRange(Long neutralInRange) {
		this.neutralInRange = neutralInRange;
	}

	public Double getRelevance() {
		return this.relevance;
	}

	public void setRelevance(Double relevance) {
		this.relevance = relevance;
	}

	public Integer getReposts() {
		return this.reposts;
	}

	public void setReposts(Integer reposts) {
		this.reposts = reposts;
	}

	public Integer getComments() {
		return this.comments;
	}

	public void setComments(Integer comments) {
		this.comments = comments;
	}

	public Timestamp getUpdated() {
		return this.updated;
	}

	public void setUpdated(Timestamp updated) {
		this.updated = updated;
	}

	public Boolean getFiltered() {
		return this.filtered;
	}

	public void setFiltered(Boolean filtered) {
		this.filtered = filtered;
	}

	public String getRepostTo() {
		return this.repostTo;
	}

	public void setRepostTo(String repostTo) {
		this.repostTo = repostTo;
	}

}