$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Umesh/eclipse-workspace/FreeCRMBDDFramework/src/main/java/Features/DealsMap.feature");
formatter.feature({
  "line": 1,
  "name": "Verify the DataTable with Map",
  "description": "",
  "id": "verify-the-datatable-with-map",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Verify the parameterization by using map with datatable",
  "description": "",
  "id": "verify-the-datatable-with-map;verify-the-parameterization-by-using-map-with-datatable",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User is on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Title of page is Free CRM",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Enter username and password",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 8
    },
    {
      "cells": [
        "umeshqa2019@gmail.com",
        "Umesh@488"
      ],
      "line": 9
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Click on Login button",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User is on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user moved to create deals page",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user enters deals details",
  "rows": [
    {
      "cells": [
        "Title",
        "Description",
        "Amount",
        "Commission"
      ],
      "line": 14
    },
    {
      "cells": [
        "Test Deal1",
        "I am Deal Page1",
        "1000",
        "50"
      ],
      "line": 15
    },
    {
      "cells": [
        "Test Deal2",
        "I am Deal Page2",
        "2000",
        "60"
      ],
      "line": 16
    },
    {
      "cells": [
        "Test Deal3",
        "I am Deal Page3",
        "3000",
        "70"
      ],
      "line": 17
    },
    {
      "cells": [
        "Test Deal4",
        "I am Deal Page4",
        "4000",
        "80"
      ],
      "line": 18
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "click on save button",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "DealsMapDefinition.user_is_on_Login_Page()"
});
formatter.result({
  "duration": 5470599800,
  "status": "passed"
});
formatter.match({
  "location": "DealsMapDefinition.title_of_page_is_Free_CRM()"
});
formatter.result({
  "duration": 18483000,
  "status": "passed"
});
formatter.match({
  "location": "DealsMapDefinition.enter_username_and_password(DataTable)"
});
formatter.result({
  "duration": 3181158600,
  "status": "passed"
});
formatter.match({
  "location": "DealsMapDefinition.click_on_Login_button()"
});
formatter.result({
  "duration": 74874400,
  "status": "passed"
});
formatter.match({
  "location": "DealsMapDefinition.user_is_on_home_page()"
});
formatter.result({
  "duration": 2038547100,
  "status": "passed"
});
formatter.match({
  "location": "DealsMapDefinition.user_moved_to_create_deals_page()"
});
formatter.result({
  "duration": 911153800,
  "status": "passed"
});
formatter.match({
  "location": "DealsMapDefinition.user_enters_deals_details(DataTable)"
});
formatter.result({
  "duration": 30227892200,
  "status": "passed"
});
formatter.match({
  "location": "DealsMapDefinition.click_on_save_button()"
});
formatter.result({
  "duration": 80800,
  "status": "passed"
});
formatter.match({
  "location": "DealsMapDefinition.close_the_browser()"
});
formatter.result({
  "duration": 833847800,
  "status": "passed"
});
});