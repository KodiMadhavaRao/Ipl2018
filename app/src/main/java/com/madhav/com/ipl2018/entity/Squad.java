package com.madhav.com.ipl2018.entity;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

/**
 * Created by madhav on 4/10/2018.
 */

public class Squad {

    /**
     * tournamentId : {"id":7749,"name":"ipl2018"}
     * squads : [{"team":{"id":1,"fullName":"Chennai Super Kings","shortName":"Super Kings","abbreviation":"CSK","primaryColor":"FDB913","secondaryColor":"0081E5","type":"m","typeString":"m"},"players":[{"id":1,"fullName":"MS Dhoni","shortName":"MS Dhoni","nationality":"Indian","dateOfBirth":363312000000,"names":["MS Dhoni","MS Dhoni"]},{"id":4944,"fullName":"KM Asif","shortName":"KM Asif","nationality":"Indian","bowlingStyle":"MEDIUM_SEAM","dateOfBirth":743472000000,"names":["KM Asif","KM Asif"]},{"id":2756,"fullName":"Sam Billings","shortName":"S Billings","nationality":"English","dateOfBirth":676944000000,"names":["Sam Billings","S Billings"]},{"id":4954,"fullName":"Chaitanya Bishnoi","shortName":"C Bishnoi","nationality":"Indian","bowlingStyle":"ORTHODOX","rightArmBowl":false,"rightHandedBat":false,"dateOfBirth":777772800000,"names":["Chaitanya Bishnoi","C Bishnoi"]},{"id":25,"fullName":"Dwayne Bravo","shortName":"DJ Bravo","nationality":"West Indian","dateOfBirth":434332800000,"names":["Dwayne Bravo","DJ Bravo"]},{"id":140,"fullName":"Deepak Chahar","shortName":"D Chahar","nationality":"Indian","dateOfBirth":713145600000,"names":["Deepak Chahar","D Chahar"]},{"id":24,"fullName":"Faf du Plessis","shortName":"F du Plessis","nationality":"South African","bowlingStyle":"LEG_SPIN","dateOfBirth":458524800000,"names":["Faf du Plessis","F du Plessis"]},{"id":103,"fullName":"Harbhajan Singh","shortName":"H Singh","nationality":"Indian","dateOfBirth":331430400000,"names":["Harbhajan Singh","H Singh"]},{"id":898,"fullName":"Imran Tahir","shortName":"I Tahir","nationality":"South African","dateOfBirth":291340800000,"names":["Imran Tahir","I Tahir"]},{"id":9,"fullName":"Ravindra Jadeja","shortName":"R Jadeja","nationality":"Indian","rightArmBowl":false,"rightHandedBat":false,"dateOfBirth":597369600000,"names":["Ravindra Jadeja","R Jadeja"]},{"id":297,"fullName":"Kedar Jadhav","shortName":"K Jadhav","nationality":"Indian","dateOfBirth":480643200000,"names":["Kedar Jadhav","K Jadhav"]},{"id":4942,"fullName":"Narayan Jagadeesan","shortName":"N Jagadeesan","nationality":"Indian","dateOfBirth":819763200000,"names":["Narayan Jagadeesan","N Jagadeesan"]},{"id":4953,"fullName":"Kshitiz Sharma","shortName":"K Sharma","nationality":"Indian","bowlingStyle":"MEDIUM_SEAM","dateOfBirth":640656000000,"names":["Kshitiz Sharma","K Sharma"]},{"id":1560,"fullName":"Monu Kumar","shortName":"M Kumar","nationality":"Indian","rightArmBowl":false,"dateOfBirth":783993600000,"names":["Monu Kumar","M Kumar"]},{"id":3746,"fullName":"Lungi Ngidi","shortName":"L Ngidi","nationality":"South African","bowlingStyle":"MEDIUM_SEAM","dateOfBirth":828057600000,"names":["Lungi Ngidi","L Ngidi"]},{"id":14,"fullName":"Suresh Raina","shortName":"S Raina","nationality":"Indian","rightHandedBat":false,"dateOfBirth":533433600000,"names":["Suresh Raina","S Raina"]},{"id":100,"fullName":"Ambati Rayudu","shortName":"A Rayudu","nationality":"Indian","dateOfBirth":496281600000,"names":["Ambati Rayudu","A Rayudu"]},{"id":1903,"fullName":"Mitchell Santner","shortName":"M Santner","nationality":"New Zealander","rightArmBowl":false,"rightHandedBat":false,"dateOfBirth":697248000000,"names":["Mitchell Santner","M Santner"]},{"id":3811,"fullName":"Kanishk Seth","shortName":"K Seth","nationality":"Indian","bowlingStyle":"MEDIUM_SEAM","rightArmBowl":false,"dateOfBirth":878601600000,"names":["Kanishk Seth","K Seth"]},{"id":1118,"fullName":"Karn Sharma","shortName":"K Sharma","nationality":"Indian","rightHandedBat":false,"dateOfBirth":561945600000,"names":["Karn Sharma","K Sharma"]},{"id":4946,"fullName":"Dhruv Shorey","shortName":"D Shorey","nationality":"Indian","bowlingStyle":"OFF_SPIN","dateOfBirth":707702400000,"names":["Dhruv Shorey","D Shorey"]},{"id":1745,"fullName":"Shardul Thakur","shortName":"S Thakur","nationality":"Indian","dateOfBirth":687571200000,"names":["Shardul Thakur","S Thakur"]},{"id":7,"fullName":"Murali Vijay","shortName":"M Vijay","nationality":"Indian","rightArmBowl":false,"rightHandedBat":false,"dateOfBirth":449625600000,"names":["Murali Vijay","M Vijay"]},{"id":227,"fullName":"Shane Watson","shortName":"S Watson","nationality":"Australian","dateOfBirth":361584000000,"names":["Shane Watson","S Watson"]},{"id":2749,"fullName":"Mark Wood","shortName":"M Wood","nationality":"English","rightArmBowl":false,"dateOfBirth":632016000000,"names":["Mark Wood","M Wood"]}],"captainId":1,"wicketKeeperId":1,"id":1690},{"team":{"id":3,"fullName":"Delhi Daredevils","shortName":"Daredevils","abbreviation":"DD","primaryColor":"004C93","secondaryColor":"F83430","type":"m","typeString":"m"},"players":[{"id":84,"fullName":"Gautam Gambhir","shortName":"G Gambhir","nationality":"Indian","rightArmBowl":false,"rightHandedBat":false,"dateOfBirth":371865600000,"names":["Gautam Gambhir","G Gambhir"]},{"id":3760,"fullName":"Abhishek Sharma","shortName":"A Sharma","nationality":"Indian","bowlingStyle":"ORTHODOX","rightArmBowl":false,"rightHandedBat":false,"dateOfBirth":968025600000,"names":["Abhishek Sharma","A Sharma"]},{"id":1561,"fullName":"Avesh Khan","shortName":"A Khan","nationality":"Indian","dateOfBirth":850435200000,"names":["Avesh Khan","A Khan"]},{"id":969,"fullName":"Trent Boult","shortName":"T Boult","nationality":"New Zealander","rightArmBowl":false,"dateOfBirth":617068800000,"names":["Trent Boult","T Boult"]},{"id":181,"fullName":"Dan Christian","shortName":"D Christian","nationality":"Australian","dateOfBirth":420854400000,"names":["Dan Christian","D Christian"]},{"id":3832,"fullName":"Sayan Ghosh","shortName":"S Ghosh","nationality":"Indian","bowlingStyle":"MEDIUM_SEAM","dateOfBirth":716601600000,"names":["Sayan Ghosh","S Ghosh"]},{"id":253,"fullName":"Gurkeerat Mann Singh","shortName":"GM Singh","nationality":"Indian","bowlingStyle":"OFF_SPIN","dateOfBirth":646617600000,"names":["Gurkeerat Mann Singh","GM Singh"]},{"id":1563,"fullName":"Shreyas Iyer","shortName":"S Iyer","nationality":"Indian","bowlingStyle":"LEG_SPIN","dateOfBirth":786672000000,"names":["Shreyas Iyer","S Iyer"]},{"id":3013,"fullName":"Sandeep Lamichhane","shortName":"S Lamichhane","nationality":"Nepalese","rightArmBowl":false,"dateOfBirth":966211200000,"names":["Sandeep Lamichhane","S Lamichhane"]},{"id":3789,"fullName":"Manjot Kalra","shortName":"M Kalra","nationality":"Indian","rightHandedBat":false,"dateOfBirth":916358400000,"names":["Manjot Kalra","M Kalra"]},{"id":282,"fullName":"Glenn Maxwell","shortName":"G Maxwell","nationality":"Australian","bowlingStyle":"OFF_SPIN","dateOfBirth":592790400000,"names":["Glenn Maxwell","G Maxwell"]},{"id":30,"fullName":"Amit Mishra","shortName":"A Mishra","nationality":"Indian","dateOfBirth":406944000000,"names":["Amit Mishra","A Mishra"]},{"id":94,"fullName":"Mohammed Shami","shortName":"M Shami","nationality":"Indian","dateOfBirth":636940800000,"names":["Mohammed Shami","M Shami"]},{"id":836,"fullName":"Chris Morris","shortName":"C Morris","nationality":"South African","bowlingStyle":"FAST_SEAM","dateOfBirth":546739200000,"names":["Chris Morris","C Morris"]},{"id":773,"fullName":"Colin Munro","shortName":"C Munro","nationality":"New Zealander","rightArmBowl":false,"rightHandedBat":false,"dateOfBirth":542419200000,"names":["Colin Munro","C Munro"]},{"id":57,"fullName":"Shahbaz Nadeem","shortName":"S Nadeem","nationality":"Indian","rightArmBowl":false,"dateOfBirth":618883200000,"names":["Shahbaz Nadeem","S Nadeem"]},{"id":52,"fullName":"Naman Ojha","shortName":"N Ojha","nationality":"Indian","dateOfBirth":427507200000,"names":["Naman Ojha","N Ojha"]},{"id":2972,"fullName":"Rishabh Pant","shortName":"R Pant","nationality":"Indian","rightArmBowl":false,"rightHandedBat":false,"dateOfBirth":875923200000,"names":["Rishabh Pant","R Pant"]},{"id":157,"fullName":"Harshal Patel","shortName":"H Patel","nationality":"Indian","dateOfBirth":659318400000,"names":["Harshal Patel","H Patel"]},{"id":1842,"fullName":"Liam Plunkett","shortName":"L Plunkett","nationality":"English","rightArmBowl":false,"dateOfBirth":481593600000,"names":["Liam Plunkett","L Plunkett"]},{"id":1906,"fullName":"Jason Roy","shortName":"J Roy","nationality":"English","dateOfBirth":648518400000,"names":["Jason Roy","J Roy"]},{"id":1083,"fullName":"Vijay Shankar","shortName":"V Shankar","nationality":"Indian","bowlingStyle":"MEDIUM_SEAM","dateOfBirth":664848000000,"names":["Vijay Shankar","V Shankar"]},{"id":3764,"fullName":"Prithvi Shaw","shortName":"P Shaw","nationality":"Indian","bowlingStyle":"OFF_SPIN","dateOfBirth":942105600000,"names":["Prithvi Shaw","P Shaw"]},{"id":1749,"fullName":"Rahul Tewatia","shortName":"R Tewatia","nationality":"Indian","bowlingStyle":"LEG_SPIN","dateOfBirth":737856000000,"names":["Rahul Tewatia","R Tewatia"]},{"id":1740,"fullName":"Jayant Yadav","shortName":"J Yadav","nationality":"Indian","dateOfBirth":632966400000,"names":["Jayant Yadav","J Yadav"]}],"captainId":84,"wicketKeeperId":2972,"id":1689},{"team":{"id":4,"fullName":"Kings XI Punjab","shortName":"Kings XI","abbreviation":"KXIP","primaryColor":"DA1F3D","secondaryColor":"FFFFFF","type":"m","typeString":"m"},"players":[{"id":8,"fullName":"Ravichandran Ashwin","shortName":"R Ashwin","nationality":"Indian","rightArmBowl":false,"rightHandedBat":false,"dateOfBirth":527299200000,"names":["Ravichandran Ashwin","R Ashwin"]},{"id":3177,"fullName":"Akshdeep Nath","shortName":"A Nath","nationality":"Indian","dateOfBirth":736992000000,"names":["Akshdeep Nath","A Nath"]},{"id":158,"fullName":"Mayank Agarwal","shortName":"M Agarwal","nationality":"Indian","dateOfBirth":666835200000,"names":["Mayank Agarwal","M Agarwal"]},{"id":2968,"fullName":"Mayank Dagar","shortName":"M Dagar","nationality":"Indian","rightArmBowl":false,"dateOfBirth":847670400000,"names":["Mayank Dagar","M Dagar"]},{"id":1478,"fullName":"Ben Dwarshuis","shortName":"B Dwarshuis","nationality":"Australian","rightArmBowl":false,"rightHandedBat":false,"dateOfBirth":772329600000,"names":["Ben Dwarshuis","B Dwarshuis"]},{"id":167,"fullName":"Aaron Finch","shortName":"A Finch","nationality":"Australian","rightArmBowl":false,"dateOfBirth":532569600000,"names":["Aaron Finch","A Finch"]},{"id":236,"fullName":"Chris Gayle","shortName":"C Gayle","nationality":"West Indian","rightHandedBat":false,"dateOfBirth":306720000000,"names":["Chris Gayle","C Gayle"]},{"id":4959,"fullName":"Manzoor Dar","shortName":"M Dar","nationality":"Indian","bowlingStyle":"OFF_SPIN","dateOfBirth":752112000000,"names":["Manzoor Dar","M Dar"]},{"id":187,"fullName":"David Miller","shortName":"D Miller","nationality":"South African","rightArmBowl":false,"rightHandedBat":false,"dateOfBirth":613440000000,"names":["David Miller","D Miller"]},{"id":4572,"fullName":"Mujeeb Ur Rahman","shortName":"M Ur Rahman","nationality":"Afghan","bowlingStyle":"OFF_SPIN","dateOfBirth":985737600000,"names":["Mujeeb Ur Rahman","M Ur Rahman"]},{"id":276,"fullName":"Karun Nair","shortName":"K Nair","nationality":"Indian","dateOfBirth":691977600000,"names":["Karun Nair","K Nair"]},{"id":1113,"fullName":"Axar Patel","shortName":"A Patel","nationality":"Indian","rightArmBowl":false,"rightHandedBat":false,"dateOfBirth":759024000000,"names":["Axar Patel","A Patel"]},{"id":1125,"fullName":"Lokesh Rahul","shortName":"L Rahul","nationality":"Indian","rightArmBowl":false,"dateOfBirth":703555200000,"names":["Lokesh Rahul","L Rahul"]},{"id":1106,"fullName":"Ankit Rajpoot","shortName":"A Rajpoot","nationality":"Indian","rightArmBowl":false,"dateOfBirth":754963200000,"names":["Ankit Rajpoot","A Rajpoot"]},{"id":2745,"fullName":"Pradeep Sahu","shortName":"P Sahu","nationality":"Indian","rightArmBowl":false,"dateOfBirth":493430400000,"names":["Pradeep Sahu","P Sahu"]},{"id":1107,"fullName":"Mohit Sharma","shortName":"M Sharma","nationality":"Indian","rightArmBowl":false,"dateOfBirth":693100800000,"names":["Mohit Sharma","M Sharma"]},{"id":2746,"fullName":"Barinder Sran","shortName":"B Sran","nationality":"Indian","rightArmBowl":false,"rightHandedBat":false,"dateOfBirth":723945600000,"names":["Barinder Sran","B Sran"]},{"id":964,"fullName":"Marcus Stoinis","shortName":"MP Stoinis","nationality":"Australian","rightArmBowl":false,"dateOfBirth":619228800000,"names":["Marcus Stoinis","MP Stoinis"]},{"id":89,"fullName":"Manoj Tiwary","shortName":"M Tiwary","nationality":"Indian","dateOfBirth":500774400000,"names":["Manoj Tiwary","M Tiwary"]},{"id":1480,"fullName":"Andrew Tye","shortName":"A Tye","nationality":"Australian","dateOfBirth":534729600000,"names":["Andrew Tye","A Tye"]},{"id":113,"fullName":"Yuvraj Singh","shortName":"Y Singh","nationality":"Indian","rightArmBowl":false,"rightHandedBat":false,"dateOfBirth":376963200000,"names":["Yuvraj Singh","Y Singh"]}],"captainId":8,"wicketKeeperId":1125,"id":1695},{"team":{"id":5,"fullName":"Kolkata Knight Riders","shortName":"Knight Riders","abbreviation":"KKR","primaryColor":"6F2C91","secondaryColor":"FFFFFF","type":"m","typeString":"m"},"players":[{"id":102,"fullName":"Dinesh Karthik","shortName":"D Karthik","nationality":"Indian","dateOfBirth":486432000000,"names":["Dinesh Karthik","D Karthik"]},{"id":76,"fullName":"Piyush Chawla","shortName":"P Chawla","nationality":"Indian","rightArmBowl":false,"rightHandedBat":false,"dateOfBirth":598924800000,"names":["Piyush Chawla","P Chawla"]},{"id":3646,"fullName":"Tom Curran","shortName":"T Curran","nationality":"English","bowlingStyle":"FAST_SEAM","dateOfBirth":794966400000,"names":["Tom Curran","T Curran"]},{"id":1896,"fullName":"Cameron Delport","shortName":"C Delport","nationality":"South African","rightArmBowl":false,"rightHandedBat":false,"dateOfBirth":610934400000,"names":["Cameron Delport","C Delport"]},{"id":37,"fullName":"Ishank Jaggi","shortName":"I Jaggi","nationality":"Indian","dateOfBirth":601862400000,"names":["Ishank Jaggi","I Jaggi"]},{"id":213,"fullName":"Mitchell Johnson","shortName":"M Johnson","nationality":"Australian","rightArmBowl":false,"rightHandedBat":false,"dateOfBirth":373507200000,"names":["Mitchell Johnson","M Johnson"]},{"id":261,"fullName":"Kuldeep Yadav","shortName":"K Yadav","nationality":"Indian","rightArmBowl":false,"rightHandedBat":false,"dateOfBirth":787363200000,"names":["Kuldeep Yadav","K Yadav"]},{"id":179,"fullName":"Chris Lynn","shortName":"C Lynn","nationality":"Australian","rightArmBowl":false,"dateOfBirth":639705600000,"names":["Chris Lynn","C Lynn"]},{"id":3766,"fullName":"Kamlesh Nagarkoti","shortName":"K Nagarkoti","nationality":"Indian","bowlingStyle":"MEDIUM_SEAM","dateOfBirth":946339200000,"names":["Kamlesh Nagarkoti","K Nagarkoti"]},{"id":203,"fullName":"Sunil Narine","shortName":"S Narine","nationality":"West Indian","rightArmBowl":false,"rightHandedBat":false,"dateOfBirth":580608000000,"names":["Sunil Narine","S Narine"]},{"id":2738,"fullName":"Nitish Rana","shortName":"N Rana","nationality":"Indian","rightHandedBat":false,"dateOfBirth":756950400000,"names":["Nitish Rana","N Rana"]},{"id":177,"fullName":"Andre Russell","shortName":"A Russell","nationality":"West Indian","rightArmBowl":false,"rightHandedBat":false,"dateOfBirth":578275200000,"names":["Andre Russell","A Russell"]},{"id":4960,"fullName":"Javon Searles","shortName":"J Searles","nationality":"West Indian","bowlingStyle":"FAST_SEAM","dateOfBirth":535507200000,"names":["Javon Searles","J Searles"]},{"id":3779,"fullName":"Shivam Mavi","shortName":"S Mavi","nationality":"Indian","bowlingStyle":"FAST_SEAM","dateOfBirth":912038400000,"names":["Shivam Mavi","S Mavi"]},{"id":3761,"fullName":"Shubman Gill","shortName":"S Gill","nationality":"Indian","bowlingStyle":"OFF_SPIN","dateOfBirth":936748800000,"names":["Shubman Gill","S Gill"]},{"id":3830,"fullName":"Rinku Singh","shortName":"R Singh","nationality":"Indian","bowlingStyle":"LEG_SPIN","dateOfBirth":876614400000,"names":["Rinku Singh","R Singh"]},{"id":127,"fullName":"Robin Uthappa","shortName":"R Uthappa","nationality":"Indian","dateOfBirth":500515200000,"names":["Robin Uthappa","R Uthappa"]},{"id":166,"fullName":"Vinay Kumar","shortName":"V Kumar","nationality":"Indian","dateOfBirth":445392000000,"names":["Vinay Kumar","V Kumar"]},{"id":264,"fullName":"Apporv Wankhade","shortName":"A Wankhade","nationality":"Indian","rightArmBowl":false,"dateOfBirth":700531200000,"names":["Apporv Wankhade","A Wankhade"]}],"captainId":102,"wicketKeeperId":102,"id":1696},{"team":{"id":6,"fullName":"Mumbai Indians","shortName":"Mumbai","abbreviation":"MI","primaryColor":"00AEEF","secondaryColor":"FFFFFF","type":"m","typeString":"m"},"players":[{"id":107,"fullName":"Rohit Sharma","shortName":"RG Sharma","nationality":"Indian","dateOfBirth":546739200000,"names":["Rohit Sharma","RG Sharma"]},{"id":1124,"fullName":"Jasprit Bumrah","shortName":"J Bumrah","nationality":"Indian","dateOfBirth":755136000000,"names":["Jasprit Bumrah","J Bumrah"]},{"id":3763,"fullName":"Rahul Chahar","shortName":"R Chahar","nationality":"Indian","bowlingStyle":"LEG_SPIN","dateOfBirth":933724800000,"names":["Rahul Chahar","R Chahar"]},{"id":488,"fullName":"Pat Cummins","shortName":"P Cummins","nationality":"Australian","bowlingStyle":"FAST_SEAM","dateOfBirth":736819200000,"names":["Pat Cummins","P Cummins"]},{"id":913,"fullName":"Ben Cutting","shortName":"B Cutting","nationality":"Australian","rightArmBowl":false,"dateOfBirth":538963200000,"names":["Ben Cutting","B Cutting"]},{"id":588,"fullName":"Akila Dananjaya","shortName":"A Dananjaya","nationality":"Sri Lankan","rightArmBowl":false,"rightHandedBat":false,"dateOfBirth":749692800000,"names":["Akila Dananjaya","A Dananjaya"]},{"id":182,"fullName":"JP Duminy","shortName":"JP Duminy","nationality":"South African","rightArmBowl":false,"rightHandedBat":false,"dateOfBirth":450748800000,"names":["JP Duminy","JP Duminy"]},{"id":2975,"fullName":"Ishan Kishan","shortName":"I Kishan","nationality":"Indian","rightArmBowl":false,"rightHandedBat":false,"dateOfBirth":900720000000,"names":["Ishan Kishan","I Kishan"]},{"id":2739,"fullName":"Siddhesh Lad","shortName":"SD Lad","nationality":"Indian","dateOfBirth":706579200000,"names":["Siddhesh Lad","SD Lad"]},{"id":872,"fullName":"Evin Lewis","shortName":"E Lewis","nationality":"West Indian","rightArmBowl":false,"rightHandedBat":false,"dateOfBirth":693792000000,"names":["Evin Lewis","E Lewis"]},{"id":4945,"fullName":"Sharad Lumba","shortName":"S Lumba","nationality":"Indian","bowlingStyle":"OFF_SPIN","dateOfBirth":621388800000,"names":["Sharad Lumba","S Lumba"]},{"id":4951,"fullName":"Mayank Markande","shortName":"M Markande","nationality":"Indian","dateOfBirth":879206400000,"names":["Mayank Markande","M Markande"]},{"id":730,"fullName":"Mitchell McClenaghan","shortName":"M McClenaghan","nationality":"New Zealander","rightArmBowl":false,"rightHandedBat":false,"dateOfBirth":518832000000,"names":["Mitchell McClenaghan","M McClenaghan"]},{"id":4952,"fullName":"Mohsin Khan","shortName":"M Khan","nationality":"Indian","bowlingStyle":"FAST_SEAM","rightArmBowl":false,"rightHandedBat":false,"dateOfBirth":900460800000,"names":["Mohsin Khan","M Khan"]},{"id":1594,"fullName":"Mustafizur Rahman","shortName":"M Rahman","nationality":"Bangladeshi","bowlingStyle":"FAST_SEAM","rightArmBowl":false,"rightHandedBat":false,"dateOfBirth":810345600000,"names":["Mustafizur Rahman","M Rahman"]},{"id":4958,"fullName":"MD Nidheesh","shortName":"MD Nidheesh","nationality":"Indian","bowlingStyle":"MEDIUM_SEAM","dateOfBirth":673401600000,"names":["MD Nidheesh","MD Nidheesh"]},{"id":2740,"fullName":"Hardik Pandya","shortName":"H Pandya","nationality":"Indian","dateOfBirth":750297600000,"names":["Hardik Pandya","H Pandya"]},{"id":3183,"fullName":"Krunal Pandya","shortName":"K Pandya","nationality":"Indian","rightArmBowl":false,"rightHandedBat":false,"dateOfBirth":669772800000,"names":["Krunal Pandya","K Pandya"]},{"id":210,"fullName":"Kieron Pollard","shortName":"K Pollard","nationality":"West Indian","dateOfBirth":547776000000,"names":["Kieron Pollard","K Pollard"]},{"id":3774,"fullName":"Anukul Roy","shortName":"A Roy","nationality":"Indian","bowlingStyle":"ORTHODOX","rightArmBowl":false,"rightHandedBat":false,"dateOfBirth":912384000000,"names":["Anukul Roy","A Roy"]},{"id":91,"fullName":"Pradeep Sangwan","shortName":"P Sangwan","nationality":"Indian","rightArmBowl":false,"dateOfBirth":657763200000,"names":["Pradeep Sangwan","P Sangwan"]},{"id":4943,"fullName":"Tajinder Singh","shortName":"T Singh","nationality":"Indian","bowlingStyle":"OFF_SPIN","dateOfBirth":706752000000,"names":["Tajinder Singh","T Singh"]},{"id":99,"fullName":"Aditya Tare","shortName":"A Tare","nationality":"Indian","dateOfBirth":1330300800000,"names":["Aditya Tare","A Tare"]},{"id":163,"fullName":"Saurabh Tiwary","shortName":"S Tiwary","nationality":"Indian","rightHandedBat":false,"dateOfBirth":630979200000,"names":["Saurabh Tiwary","S Tiwary"]},{"id":108,"fullName":"Suryakumar Yadav","shortName":"S Yadav","nationality":"Indian","dateOfBirth":653270400000,"names":["Suryakumar Yadav","S Yadav"]}],"captainId":107,"wicketKeeperId":99,"id":1691},{"team":{"id":8,"fullName":"Rajasthan Royals","shortName":"Royals","abbreviation":"RR","primaryColor":"004B8C","secondaryColor":"FFFFFF","type":"m","typeString":"m"},"players":[{"id":32,"fullName":"Ankit Sharma","shortName":"A Sharma","nationality":"Indian","rightArmBowl":false,"rightHandedBat":false,"dateOfBirth":672105600000,"names":["Ankit Sharma","A Sharma"]},{"id":412,"fullName":"Anureet Singh","shortName":"Anureet Singh","nationality":"Indian","rightArmBowl":false,"dateOfBirth":383529600000,"names":["Anureet Singh","Anureet Singh"]},{"id":3502,"fullName":"Jofra Archer","shortName":"J Archer","nationality":"West Indian","bowlingStyle":"FAST_SEAM","dateOfBirth":796694400000,"names":["Jofra Archer","J Archer"]},{"id":148,"fullName":"Stuart Binny","shortName":"S Binny","nationality":"Indian","dateOfBirth":455068800000,"names":["Stuart Binny","S Binny"]},{"id":4956,"fullName":"Aryaman Birla","shortName":"A Birla","nationality":"Indian","bowlingStyle":"ORTHODOX","rightArmBowl":false,"rightHandedBat":false,"dateOfBirth":868406400000,"names":["Aryaman Birla","A Birla"]},{"id":509,"fullName":"Jos Buttler","shortName":"J Buttler","nationality":"English","dateOfBirth":652752000000,"names":["Jos Buttler","J Buttler"]},{"id":817,"fullName":"Dushmantha Chameera","shortName":"D Chameera","nationality":"Sri Lankan","rightArmBowl":false,"dateOfBirth":695088000000,"names":["Dushmantha Chameera","D Chameera"]},{"id":3226,"fullName":"Prashant Chopra","shortName":"P Chopra","nationality":"Indian","rightArmBowl":false,"dateOfBirth":718416000000,"names":["Prashant Chopra","P Chopra"]},{"id":1748,"fullName":"Shreyas Gopal","shortName":"S Gopal","nationality":"Indian","dateOfBirth":747100800000,"names":["Shreyas Gopal","S Gopal"]},{"id":3834,"fullName":"Krishnappa Gowtham","shortName":"K Gowtham","nationality":"Indian","bowlingStyle":"OFF_SPIN","dateOfBirth":593308800000,"names":["Krishnappa Gowtham","K Gowtham"]},{"id":3869,"fullName":"Heinrich Klaasen","shortName":"H Klaasen","nationality":"South African","dateOfBirth":680832000000,"names":["Heinrich Klaasen","H Klaasen"]},{"id":101,"fullName":"Dhawal Kulkarni","shortName":"D Kulkarni","nationality":"Indian","dateOfBirth":597715200000,"names":["Dhawal Kulkarni","D Kulkarni"]},{"id":921,"fullName":"Ben Laughlin","shortName":"B Laughlin","nationality":"Australian","rightArmBowl":false,"dateOfBirth":402451200000,"names":["Ben Laughlin","B Laughlin"]},{"id":2970,"fullName":"Mahipal Lomror","shortName":"M Lomror","nationality":"Indian","rightArmBowl":false,"rightHandedBat":false,"dateOfBirth":942710400000,"names":["Mahipal Lomror","M Lomror"]},{"id":4950,"fullName":"Sudhesan Midhun","shortName":"S Midhun","nationality":"Indian","bowlingStyle":"LEG_SPIN","dateOfBirth":781488000000,"names":["Sudhesan Midhun","S Midhun"]},{"id":135,"fullName":"Ajinkya Rahane","shortName":"A Rahane","nationality":"Indian","dateOfBirth":581558400000,"names":["Ajinkya Rahane","A Rahane"]},{"id":258,"fullName":"Sanju Samson","shortName":"S Samson","nationality":"Indian","dateOfBirth":784512000000,"names":["Sanju Samson","S Samson"]},{"id":4955,"fullName":"Jatin Saxena","shortName":"J Saxena","nationality":"Indian","bowlingStyle":"LEG_SPIN","dateOfBirth":397267200000,"names":["Jatin Saxena","J Saxena"]},{"id":3887,"fullName":"D'Arcy Short","shortName":"D Short","nationality":"Australian","bowlingStyle":"UNORTHODOX","rightArmBowl":false,"rightHandedBat":false,"dateOfBirth":650160000000,"names":["D'Arcy Short","D Short"]},{"id":1154,"fullName":"Ben Stokes","shortName":"B Stokes","nationality":"English","rightHandedBat":false,"dateOfBirth":675993600000,"names":["Ben Stokes","B Stokes"]},{"id":3838,"fullName":"Rahul Tripathi","shortName":"R Tripathi","nationality":"Indian","bowlingStyle":"MEDIUM_SEAM","dateOfBirth":667872000000,"names":["Rahul Tripathi","R Tripathi"]},{"id":86,"fullName":"Jaydev Unadkat","shortName":"J Unadkat","nationality":"Indian","rightArmBowl":false,"dateOfBirth":687744000000,"names":["Jaydev Unadkat","J Unadkat"]},{"id":2909,"fullName":"Zahir Khan","shortName":"Z Khan","nationality":"Afghan","rightArmBowl":false,"rightHandedBat":false,"dateOfBirth":914112000000,"names":["Zahir Khan","Z Khan"]}],"captainId":135,"wicketKeeperId":509,"id":1692},{"team":{"id":9,"fullName":"Royal Challengers Bangalore","shortName":"Challengers","abbreviation":"RCB","primaryColor":"000000","secondaryColor":"FF3245","type":"m","typeString":"m"},"players":[{"id":164,"fullName":"Virat Kohli","shortName":"V Kohli","nationality":"Indian","dateOfBirth":594691200000,"names":["Virat Kohli","V Kohli"]},{"id":1735,"fullName":"Moeen Ali","shortName":"M Ali","nationality":"English","rightArmBowl":false,"rightHandedBat":false,"dateOfBirth":550972800000,"names":["Moeen Ali","M Ali"]},{"id":968,"fullName":"Corey Anderson","shortName":"C Anderson","nationality":"New Zealander","rightArmBowl":false,"rightHandedBat":false,"dateOfBirth":661046400000,"names":["Corey Anderson","C Anderson"]},{"id":3187,"fullName":"Murugan Ashwin","shortName":"M Ashwin","nationality":"Indian","bowlingStyle":"LEG_SPIN","dateOfBirth":652752000000,"names":["Murugan Ashwin","M Ashwin"]},{"id":111,"fullName":"Yuzvendra Chahal","shortName":"Y Chahal","nationality":"Indian","dateOfBirth":648691200000,"names":["Yuzvendra Chahal","Y Chahal"]},{"id":1111,"fullName":"Aniket Choudhary","shortName":"A Choudhary","nationality":"Indian","rightArmBowl":false,"dateOfBirth":633484800000,"names":["Aniket Choudhary","A Choudhary"]},{"id":820,"fullName":"Colin de Grandhomme","shortName":"C de Grandhomme","nationality":"New Zealander","bowlingStyle":"FAST_SEAM","dateOfBirth":522374400000,"names":["Colin de Grandhomme","C de Grandhomme"]},{"id":834,"fullName":"Quinton de Kock","shortName":"Q de Kock","nationality":"South African","rightArmBowl":false,"rightHandedBat":false,"dateOfBirth":724550400000,"names":["Quinton de Kock","Q de Kock"]},{"id":4957,"fullName":"Pavan Deshpande","shortName":"P Deshpande","nationality":"Indian","bowlingStyle":"OFF_SPIN","rightHandedBat":false,"dateOfBirth":621907200000,"names":["Pavan Deshpande","P Deshpande"]},{"id":233,"fullName":"AB de Villiers","shortName":"AB de Villiers","nationality":"South African","dateOfBirth":445824000000,"names":["AB de Villiers","AB de Villiers"]},{"id":4949,"fullName":"Aniruddha Joshi","shortName":"A Joshi","nationality":"Indian","bowlingStyle":"OFF_SPIN","dateOfBirth":563241600000,"names":["Aniruddha Joshi","A Joshi"]},{"id":1564,"fullName":"Sarfaraz Khan","shortName":"S Khan","nationality":"Indian","dateOfBirth":877478400000,"names":["Sarfaraz Khan","S Khan"]},{"id":3835,"fullName":"Kulwant Khejroliya","shortName":"K Khejroliya","nationality":"Indian","bowlingStyle":"FAST_SEAM","rightArmBowl":false,"rightHandedBat":false,"dateOfBirth":794102400000,"names":["Kulwant Khejroliya","K Khejroliya"]},{"id":202,"fullName":"Brendon McCullum","shortName":"B McCullum","nationality":"New Zealander","dateOfBirth":370396800000,"names":["Brendon McCullum","B McCullum"]},{"id":72,"fullName":"Mandeep Singh","shortName":"M Singh","nationality":"Indian","dateOfBirth":693014400000,"names":["Mandeep Singh","M Singh"]},{"id":3840,"fullName":"Mohammed Siraj","shortName":"M Siraj","nationality":"Indian","bowlingStyle":"MEDIUM_SEAM","dateOfBirth":763516800000,"names":["Mohammed Siraj","M Siraj"]},{"id":53,"fullName":"Pawan Negi","shortName":"P Negi","nationality":"Indian","rightArmBowl":false,"rightHandedBat":false,"dateOfBirth":410659200000,"names":["Pawan Negi","P Negi"]},{"id":44,"fullName":"Parthiv Patel","shortName":"P Patel","nationality":"Indian","rightArmBowl":false,"rightHandedBat":false,"dateOfBirth":479174400000,"names":["Parthiv Patel","P Patel"]},{"id":3824,"fullName":"Navdeep Saini","shortName":"N Saini","nationality":"Indian","bowlingStyle":"MEDIUM_SEAM","dateOfBirth":722476800000,"names":["Navdeep Saini","N Saini"]},{"id":307,"fullName":"Tim Southee","shortName":"T Southee","nationality":"New Zealander","dateOfBirth":597801600000,"names":["Tim Southee","T Southee"]},{"id":1085,"fullName":"Manan Vohra","shortName":"M Vohra","nationality":"Indian","rightArmBowl":false,"dateOfBirth":742953600000,"names":["Manan Vohra","M Vohra"]},{"id":2973,"fullName":"Washington Sundar","shortName":"W Sundar","nationality":"Indian","rightHandedBat":false,"dateOfBirth":939081600000,"names":["Washington Sundar","W Sundar"]},{"id":967,"fullName":"Chris Woakes","shortName":"C Woakes","nationality":"English","rightArmBowl":false,"dateOfBirth":604800000000,"names":["Chris Woakes","C Woakes"]},{"id":59,"fullName":"Umesh Yadav","shortName":"U Yadav","nationality":"Indian","dateOfBirth":562118400000,"names":["Umesh Yadav","U Yadav"]}],"captainId":164,"wicketKeeperId":834,"id":1693},{"team":{"id":62,"fullName":"Sunrisers Hyderabad","shortName":"Sunrisers","abbreviation":"SRH","primaryColor":"FF9C00","secondaryColor":"FFFFFF","type":"m","typeString":"m"},"players":[{"id":440,"fullName":"Kane Williamson","shortName":"K Williamson","nationality":"New Zealander","rightArmBowl":false,"dateOfBirth":650073600000,"names":["Kane Williamson","K Williamson"]},{"id":3839,"fullName":"Tanmay Agarwal","shortName":"T Agarwal","nationality":"Indian","bowlingStyle":"LEG_SPIN","rightHandedBat":false,"dateOfBirth":799459200000,"names":["Tanmay Agarwal","T Agarwal"]},{"id":2964,"fullName":"Khaleel Ahmed","shortName":"K Ahmed","nationality":"Indian","rightArmBowl":false,"dateOfBirth":881280000000,"names":["Khaleel Ahmed","K Ahmed"]},{"id":3825,"fullName":"Basil Thampi","shortName":"B Thampi","nationality":"Indian","bowlingStyle":"MEDIUM_SEAM","dateOfBirth":747705600000,"names":["Basil Thampi","B Thampi"]},{"id":1555,"fullName":"Ricky Bhui","shortName":"R Bhui","nationality":"Indian","rightArmBowl":false,"dateOfBirth":843955200000,"names":["Ricky Bhui","R Bhui"]},{"id":69,"fullName":"Bipul Sharma","shortName":"B Sharma","nationality":"Indian","rightArmBowl":false,"rightHandedBat":false,"dateOfBirth":433555200000,"names":["Bipul Sharma","B Sharma"]},{"id":2722,"fullName":"Carlos Brathwaite","shortName":"C Brathwaite","nationality":"West Indian","bowlingStyle":"MEDIUM_SEAM","dateOfBirth":585187200000,"names":["Carlos Brathwaite","C Brathwaite"]},{"id":41,"fullName":"Shikhar Dhawan","shortName":"S Dhawan","nationality":"Indian","rightArmBowl":false,"rightHandedBat":false,"dateOfBirth":502588800000,"names":["Shikhar Dhawan","S Dhawan"]},{"id":95,"fullName":"Shreevats Goswami","shortName":"S Goswami","nationality":"Indian","rightArmBowl":false,"rightHandedBat":false,"dateOfBirth":611452800000,"names":["Shreevats Goswami","S Goswami"]},{"id":511,"fullName":"Alex Hales","shortName":"A Hales","nationality":"English","rightArmBowl":false,"dateOfBirth":599788800000,"names":["Alex Hales","A Hales"]},{"id":4965,"fullName":"Mehdi Hasan","shortName":"M Hasan","nationality":"Indian","bowlingStyle":"ORTHODOX","rightArmBowl":false,"rightHandedBat":false,"dateOfBirth":634003200000,"names":["Mehdi Hasan","M Hasan"]},{"id":1556,"fullName":"Deepak Hooda","shortName":"D Hooda","nationality":"Indian","rightArmBowl":false,"dateOfBirth":798249600000,"names":["Deepak Hooda","D Hooda"]},{"id":1299,"fullName":"Chris Jordan","shortName":"C Jordan","nationality":"English","dateOfBirth":591926400000,"names":["Chris Jordan","C Jordan"]},{"id":1086,"fullName":"Siddarth Kaul","shortName":"S Kaul","nationality":"Indian","rightArmBowl":false,"dateOfBirth":643075200000,"names":["Siddarth Kaul","S Kaul"]},{"id":116,"fullName":"Bhuvneshwar Kumar","shortName":"B Kumar","nationality":"Indian","dateOfBirth":660355200000,"names":["Bhuvneshwar Kumar","B Kumar"]},{"id":618,"fullName":"Mohammad Nabi","shortName":"M Nabi","nationality":"Afghan","bowlingStyle":"OFF_SPIN","dateOfBirth":473385600000,"names":["Mohammad Nabi","M Nabi"]},{"id":3831,"fullName":"T Natarajan","shortName":"T Natarajan","nationality":"Indian","bowlingStyle":"MEDIUM_SEAM","rightArmBowl":false,"rightHandedBat":false,"dateOfBirth":675302400000,"names":["T Natarajan","T Natarajan"]},{"id":123,"fullName":"Manish Pandey","shortName":"M Pandey","nationality":"Indian","rightArmBowl":false,"dateOfBirth":621388800000,"names":["Manish Pandey","M Pandey"]},{"id":96,"fullName":"Yusuf Pathan","shortName":"Y Pathan","nationality":"Indian","rightArmBowl":false,"dateOfBirth":406339200000,"names":["Yusuf Pathan","Y Pathan"]},{"id":2885,"fullName":"Rashid Khan","shortName":"R Khan","nationality":"Afghan","bowlingStyle":"LEG_SPIN","dateOfBirth":906249600000,"names":["Rashid Khan","R Khan"]},{"id":1115,"fullName":"Sachin Baby","shortName":"S Baby","nationality":"Indian","rightHandedBat":false,"dateOfBirth":598406400000,"names":["Sachin Baby","S Baby"]},{"id":16,"fullName":"Wriddhiman Saha","shortName":"W Saha","nationality":"Indian","dateOfBirth":467424000000,"names":["Wriddhiman Saha","W Saha"]},{"id":1112,"fullName":"Sandeep Sharma","shortName":"Sandeep Sharma","nationality":"Indian","rightArmBowl":false,"dateOfBirth":737683200000,"names":["Sandeep Sharma","Sandeep Sharma"]},{"id":201,"fullName":"Shakib Al Hasan","shortName":"S Al Hasan","nationality":"Bangladeshi","rightArmBowl":false,"rightHandedBat":false,"dateOfBirth":543542400000,"names":["Shakib Al Hasan","S Al Hasan"]},{"id":1521,"fullName":"Billy Stanlake","shortName":"B Stanlake","nationality":"Australian","rightHandedBat":false,"dateOfBirth":783907200000,"names":["Billy Stanlake","B Stanlake"]}],"captainId":440,"wicketKeeperId":16,"id":1694}]
     */

    @SerializedName("tournamentId")
    private TournamentId tournamentId;
    @SerializedName("squads")
    private List<Squads> squads;

    public TournamentId getTournamentId() {
        return tournamentId;
    }

    public void setTournamentId(TournamentId tournamentId) {
        this.tournamentId = tournamentId;
    }

    public List<Squads> getSquads() {
        return squads;
    }

    public void setSquads(List<Squads> squads) {
        this.squads = squads;
    }

    public static class TournamentId {
        /**
         * id : 7749
         * name : ipl2018
         */

        @SerializedName("id")
        private int id;
        @SerializedName("name")
        private String name;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static class Squads implements Serializable {
        /**
         * team : {"id":1,"fullName":"Chennai Super Kings","shortName":"Super Kings","abbreviation":"CSK","primaryColor":"FDB913","secondaryColor":"0081E5","type":"m","typeString":"m"}
         * players : [{"id":1,"fullName":"MS Dhoni","shortName":"MS Dhoni","nationality":"Indian","dateOfBirth":363312000000,"names":["MS Dhoni","MS Dhoni"]},{"id":4944,"fullName":"KM Asif","shortName":"KM Asif","nationality":"Indian","bowlingStyle":"MEDIUM_SEAM","dateOfBirth":743472000000,"names":["KM Asif","KM Asif"]},{"id":2756,"fullName":"Sam Billings","shortName":"S Billings","nationality":"English","dateOfBirth":676944000000,"names":["Sam Billings","S Billings"]},{"id":4954,"fullName":"Chaitanya Bishnoi","shortName":"C Bishnoi","nationality":"Indian","bowlingStyle":"ORTHODOX","rightArmBowl":false,"rightHandedBat":false,"dateOfBirth":777772800000,"names":["Chaitanya Bishnoi","C Bishnoi"]},{"id":25,"fullName":"Dwayne Bravo","shortName":"DJ Bravo","nationality":"West Indian","dateOfBirth":434332800000,"names":["Dwayne Bravo","DJ Bravo"]},{"id":140,"fullName":"Deepak Chahar","shortName":"D Chahar","nationality":"Indian","dateOfBirth":713145600000,"names":["Deepak Chahar","D Chahar"]},{"id":24,"fullName":"Faf du Plessis","shortName":"F du Plessis","nationality":"South African","bowlingStyle":"LEG_SPIN","dateOfBirth":458524800000,"names":["Faf du Plessis","F du Plessis"]},{"id":103,"fullName":"Harbhajan Singh","shortName":"H Singh","nationality":"Indian","dateOfBirth":331430400000,"names":["Harbhajan Singh","H Singh"]},{"id":898,"fullName":"Imran Tahir","shortName":"I Tahir","nationality":"South African","dateOfBirth":291340800000,"names":["Imran Tahir","I Tahir"]},{"id":9,"fullName":"Ravindra Jadeja","shortName":"R Jadeja","nationality":"Indian","rightArmBowl":false,"rightHandedBat":false,"dateOfBirth":597369600000,"names":["Ravindra Jadeja","R Jadeja"]},{"id":297,"fullName":"Kedar Jadhav","shortName":"K Jadhav","nationality":"Indian","dateOfBirth":480643200000,"names":["Kedar Jadhav","K Jadhav"]},{"id":4942,"fullName":"Narayan Jagadeesan","shortName":"N Jagadeesan","nationality":"Indian","dateOfBirth":819763200000,"names":["Narayan Jagadeesan","N Jagadeesan"]},{"id":4953,"fullName":"Kshitiz Sharma","shortName":"K Sharma","nationality":"Indian","bowlingStyle":"MEDIUM_SEAM","dateOfBirth":640656000000,"names":["Kshitiz Sharma","K Sharma"]},{"id":1560,"fullName":"Monu Kumar","shortName":"M Kumar","nationality":"Indian","rightArmBowl":false,"dateOfBirth":783993600000,"names":["Monu Kumar","M Kumar"]},{"id":3746,"fullName":"Lungi Ngidi","shortName":"L Ngidi","nationality":"South African","bowlingStyle":"MEDIUM_SEAM","dateOfBirth":828057600000,"names":["Lungi Ngidi","L Ngidi"]},{"id":14,"fullName":"Suresh Raina","shortName":"S Raina","nationality":"Indian","rightHandedBat":false,"dateOfBirth":533433600000,"names":["Suresh Raina","S Raina"]},{"id":100,"fullName":"Ambati Rayudu","shortName":"A Rayudu","nationality":"Indian","dateOfBirth":496281600000,"names":["Ambati Rayudu","A Rayudu"]},{"id":1903,"fullName":"Mitchell Santner","shortName":"M Santner","nationality":"New Zealander","rightArmBowl":false,"rightHandedBat":false,"dateOfBirth":697248000000,"names":["Mitchell Santner","M Santner"]},{"id":3811,"fullName":"Kanishk Seth","shortName":"K Seth","nationality":"Indian","bowlingStyle":"MEDIUM_SEAM","rightArmBowl":false,"dateOfBirth":878601600000,"names":["Kanishk Seth","K Seth"]},{"id":1118,"fullName":"Karn Sharma","shortName":"K Sharma","nationality":"Indian","rightHandedBat":false,"dateOfBirth":561945600000,"names":["Karn Sharma","K Sharma"]},{"id":4946,"fullName":"Dhruv Shorey","shortName":"D Shorey","nationality":"Indian","bowlingStyle":"OFF_SPIN","dateOfBirth":707702400000,"names":["Dhruv Shorey","D Shorey"]},{"id":1745,"fullName":"Shardul Thakur","shortName":"S Thakur","nationality":"Indian","dateOfBirth":687571200000,"names":["Shardul Thakur","S Thakur"]},{"id":7,"fullName":"Murali Vijay","shortName":"M Vijay","nationality":"Indian","rightArmBowl":false,"rightHandedBat":false,"dateOfBirth":449625600000,"names":["Murali Vijay","M Vijay"]},{"id":227,"fullName":"Shane Watson","shortName":"S Watson","nationality":"Australian","dateOfBirth":361584000000,"names":["Shane Watson","S Watson"]},{"id":2749,"fullName":"Mark Wood","shortName":"M Wood","nationality":"English","rightArmBowl":false,"dateOfBirth":632016000000,"names":["Mark Wood","M Wood"]}]
         * captainId : 1
         * wicketKeeperId : 1
         * id : 1690
         */

        @SerializedName("team")
        private Team team;
        @SerializedName("captainId")
        private int captainId;
        @SerializedName("wicketKeeperId")
        private int wicketKeeperId;
        @SerializedName("id")
        private int id;
        @SerializedName("players")
        private List<Players> players;

        public Team getTeam() {
            return team;
        }

        public void setTeam(Team team) {
            this.team = team;
        }

        public int getCaptainId() {
            return captainId;
        }

        public void setCaptainId(int captainId) {
            this.captainId = captainId;
        }

        public int getWicketKeeperId() {
            return wicketKeeperId;
        }

        public void setWicketKeeperId(int wicketKeeperId) {
            this.wicketKeeperId = wicketKeeperId;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public List<Players> getPlayers() {
            return players;
        }

        public void setPlayers(List<Players> players) {
            this.players = players;
        }

        public static class Team {
            /**
             * id : 1
             * fullName : Chennai Super Kings
             * shortName : Super Kings
             * abbreviation : CSK
             * primaryColor : FDB913
             * secondaryColor : 0081E5
             * type : m
             * typeString : m
             */

            @SerializedName("id")
            private int id;
            @SerializedName("fullName")
            private String fullName;
            @SerializedName("shortName")
            private String shortName;
            @SerializedName("abbreviation")
            private String abbreviation;
            @SerializedName("primaryColor")
            private String primaryColor;
            @SerializedName("secondaryColor")
            private String secondaryColor;
            @SerializedName("type")
            private String type;
            @SerializedName("typeString")
            private String typeString;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getFullName() {
                return fullName;
            }

            public void setFullName(String fullName) {
                this.fullName = fullName;
            }

            public String getShortName() {
                return shortName;
            }

            public void setShortName(String shortName) {
                this.shortName = shortName;
            }

            public String getAbbreviation() {
                return abbreviation;
            }

            public void setAbbreviation(String abbreviation) {
                this.abbreviation = abbreviation;
            }

            public String getPrimaryColor() {
                return primaryColor;
            }

            public void setPrimaryColor(String primaryColor) {
                this.primaryColor = primaryColor;
            }

            public String getSecondaryColor() {
                return secondaryColor;
            }

            public void setSecondaryColor(String secondaryColor) {
                this.secondaryColor = secondaryColor;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getTypeString() {
                return typeString;
            }

            public void setTypeString(String typeString) {
                this.typeString = typeString;
            }
        }

        public static class Players {
            /**
             * id : 1
             * fullName : MS Dhoni
             * shortName : MS Dhoni
             * nationality : Indian
             * dateOfBirth : 363312000000
             * names : ["MS Dhoni","MS Dhoni"]
             * bowlingStyle : MEDIUM_SEAM
             * rightArmBowl : false
             * rightHandedBat : false
             */

            @SerializedName("id")
            private int id;
            @SerializedName("fullName")
            private String fullName;
            @SerializedName("shortName")
            private String shortName;
            @SerializedName("nationality")
            private String nationality;
            @SerializedName("dateOfBirth")
            private long dateOfBirth;
            @SerializedName("bowlingStyle")
            private String bowlingStyle;
            @SerializedName("rightArmBowl")
            private boolean rightArmBowl;
            @SerializedName("rightHandedBat")
            private boolean rightHandedBat;
            @SerializedName("names")
            private List<String> names;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getFullName() {
                return fullName;
            }

            public void setFullName(String fullName) {
                this.fullName = fullName;
            }

            public String getShortName() {
                return shortName;
            }

            public void setShortName(String shortName) {
                this.shortName = shortName;
            }

            public String getNationality() {
                return nationality;
            }

            public void setNationality(String nationality) {
                this.nationality = nationality;
            }

            public long getDateOfBirth() {
                return dateOfBirth;
            }

            public void setDateOfBirth(long dateOfBirth) {
                this.dateOfBirth = dateOfBirth;
            }

            public String getBowlingStyle() {
                return bowlingStyle;
            }

            public void setBowlingStyle(String bowlingStyle) {
                this.bowlingStyle = bowlingStyle;
            }

            public boolean isRightArmBowl() {
                return rightArmBowl;
            }

            public void setRightArmBowl(boolean rightArmBowl) {
                this.rightArmBowl = rightArmBowl;
            }

            public boolean isRightHandedBat() {
                return rightHandedBat;
            }

            public void setRightHandedBat(boolean rightHandedBat) {
                this.rightHandedBat = rightHandedBat;
            }

            public List<String> getNames() {
                return names;
            }

            public void setNames(List<String> names) {
                this.names = names;
            }
        }
    }
}
