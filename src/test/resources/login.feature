Feature: User wants to login in,

Scenario Outline: User logs in correctly
	I open pagina webpagen
	When user inserts his <usuario> and <contrasenia>
	And clicks login
	Then mailpage is opened
	
Examples:
| usuario | contrasenia|
| "javier" | "vildozo" |