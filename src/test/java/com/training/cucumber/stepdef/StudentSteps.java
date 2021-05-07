package com.training.cucumber.stepdef;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class StudentSteps {

	List<Map<String, String>> data = null;
	List<List<String>> dataList = null;

	// Map<String, String>``
	// {"name":"John", "rollNo":"4"}, ---------------- data.get(0)
	// {"name":"Mark", "rollNo":"3"} ---------------- data.get(1)

	@Given("The Student details as below")
	public void student_details(DataTable dataTable) {
		data = dataTable.asMaps(String.class, String.class);
		dataList = dataTable.asLists(String.class);
	}

	@Then("Student details are printed")
	public void student_details_are_printed() {
		System.out.println("Total records: " + data.size());
		System.out.println("name" + "\t\t" + "rollNo");
		for (int i = 0; i < data.size(); i++) {
			System.out.println(data.get(i).get("name") + "\t\t" + data.get(i).get("rollNo"));
		}

		System.out.println("====================List<List>>======================================");
		System.out.println("Total records: " + dataList.size());
		for (int i = 0; i < dataList.size(); i++) {
			System.out.println(dataList.get(i).get(0) + "\t\t" + dataList.get(i).get(1));
		}
	}

}
