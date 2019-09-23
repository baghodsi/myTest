package com.example.myDemo.hero;

public class Hero {
	private Long id;
	private String titleId;
	private String name;
	private String age;
	private String cardId;
	private String description;

	public Hero() {

	}

	public Hero(long id, String titleId, String name, String age, String cardId) {
		super();
		this.id = id;
		this.titleId = titleId;
		this.name = name;
		this.age = age;
		this.cardId = cardId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitleId() {
		return titleId;
	}

	public void setTitleId(String id) {
		this.titleId = id;
	}

    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

    public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

    public String getCardId() {
		return cardId;
	}

	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

    public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	// @Override
	// public int hashCode() {
	// 	final int prime = 31;
	// 	int result = 1;
	// 	result = prime * result + ((description == null) ? 0 : description.hashCode());
	// 	result = prime * result + ((id == null) ? 0 : id.hashCode());
	// 	result = prime * result + ((cardId == null) ? 0 : cardId.hashCode());
	// 	return result;
	// }
}