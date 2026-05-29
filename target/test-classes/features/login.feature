Feature: Verifying omrbranch login Module
	Scenario: Login with valid credentials
		Given User is on the omrbranch page
		When User enters "<username>" and "<password>"
		And User clicks the login button
		Then User should verify Success message after login
			Examples:
				|username|password|
				|premkaanth2000@gmail.com|Prem@1234|

		