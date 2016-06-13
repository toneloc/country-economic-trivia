package com.toneloc.countrytrivia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.*;

public class MainActivity extends AppCompatActivity {

    private Country[] mCountries = new Country[155];

    private TextView mQuestionTxt; //
    private Country country1; //our random country 1
    private Country country2; //our random country 2
    private Country country3; //our random country 3
    private Country answer; //answer country

    boolean gotCorrectAnswer;
    private TextView mTxtAttempts;
    private TextView mTxtScore;

    private Button mBtn1;
    private Button mBtn2;
    private Button mBtn3;
    private Toast mToast;

    private int score = 0;
    private int attempts = 0;

    private int randomNumber1;
    private int randomNumber2;
    private int randomNumber3;
    private int randomNumber4;
    int questionType;

    private View.OnClickListener mClickListener1;
    private View.OnClickListener mClickListener2;
    private View.OnClickListener mClickListener3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        mCountries[0] = new Country("United States","USA",17419000000000D,318857056,54629);
        mCountries[1] = new Country("China","CHN",10354832000000D,1364270000,7590);
        mCountries[2] = new Country("Japan","JPN",4601461000000D,127131800,36194);
        mCountries[3] = new Country("Germany","DEU",3868291000000D,80970732,47774);
        mCountries[4] = new Country("United Kingdom","GBR",2988893000000D,64559135,46297);
        mCountries[5] = new Country("France","FRA",2829192000000D,66217509,42726);
        mCountries[6] = new Country("Brazil","BRA",2416636000000D,206077898,11727);
        mCountries[7] = new Country("Italy","ITA",2141161000000D,60789140,35223);
        mCountries[8] = new Country("India","IND",2048517000000.D,1295291543,1582);
        mCountries[9] = new Country("Russian Federation","RUS",1860598000000D,143819569,12937);
        mCountries[10] = new Country("Canada","CAN",1785387000000D,35543658,50231);
        mCountries[11] = new Country("Australia","AUS",1454675000000D,23470118,61980);
        mCountries[12] = new Country("Korea, Rep.","KOR",1410383000000D,50423955,27970);
        mCountries[13] = new Country("Spain","ESP",1381342000000D,46476032,29722);
        mCountries[14] = new Country("Mexico","MEX",1294690000000D,125385833,10326);
        mCountries[15] = new Country("Indonesia","IDN",888538000000D,254454778,3492);
        mCountries[16] = new Country("Netherlands","NLD",879319000000D,16865008,52139);
        mCountries[17] = new Country("Turkey","TUR",798429000000D,75932348,10515);
        mCountries[18] = new Country("Saudi Arabia","SAU",753832000000D,30886545,24406);
        mCountries[19] = new Country("Switzerland","CHE",701037000000D,8188102,85617);
        mCountries[20] = new Country("Sweden","SWE",571090000000D,9696110,58899);
        mCountries[21] = new Country("Nigeria","NGA",568508000000D,177475986,3203);
        mCountries[22] = new Country("Poland","POL",544967000000D,38011735,14337);
        mCountries[23] = new Country("Argentina","ARG",537660000000.D,42980026,12510);
        mCountries[24] = new Country("Belgium","BEL",531547000000D,11231213,47328);
        mCountries[25] = new Country("Norway","NOR",499817000000D,5136886,97300);
        mCountries[26] = new Country("Austria","AUT",436888000000D,8545908,51122);
        mCountries[27] = new Country("Iran","IRN",425326000000D,78143644,5443);
        mCountries[28] = new Country("Thailand","THA",404824000000D,67725979,5977);
        mCountries[29] = new Country("United Arab Emirates","ARE",399451000000D,9086139,43963);
        mCountries[30] = new Country("Venezuela","VEN",381286000000D,4294682,88781);
        mCountries[31] = new Country("Colombia","COL",377740000000D,47791393,7904);
        mCountries[32] = new Country("South Africa","ZAF",350141000000D,74877030,4676);
        mCountries[33] = new Country("Denmark","DNK",342362000000D,5638530,60718);
        mCountries[34] = new Country("Malaysia","MYS",338104000000D,29901997,11307);
        mCountries[35] = new Country("Singapore","SGP",307860000000D,5469724,56284);
        mCountries[36] = new Country("Israel","ISR",305675000000D,8215700,37206);
        mCountries[37] = new Country("Egypt","EGY",301499000000D,89579670,3366);
        mCountries[38] = new Country("Hong Kong","HKG",290896000000D,7241700,40170);
        mCountries[39] = new Country("Philippines","PHL",284777000000D,99138690,2873);
        mCountries[40] = new Country("Finland","FIN",272217000000.D,5461512,49843);
        mCountries[41] = new Country("Chile","CHL",258062000000D,17762647,14528);
        mCountries[42] = new Country("Ireland","IRL",250814000000D,4615693,54339);
        mCountries[43] = new Country("Pakistan","PAK",243632000000D,185044286,1317);
        mCountries[44] = new Country("Greece","GRC",235574000000D,10869637,21673);
        mCountries[45] = new Country("Portugal","PRT",230117000000D,10401062,22124);
        mCountries[46] = new Country("Iraq","IRQ",223500000000D,34812326,6420);
        mCountries[47] = new Country("Kazakhstan","KAZ",217872000000D,17289224,12602);
        mCountries[48] = new Country("Algeria","DZA",213518000000D,38934334,5484);
        mCountries[49] = new Country("Qatar","QAT",210109000000D,2172065,96732);
        mCountries[50] = new Country("Czech Republic","CZE",205270000000D,10525347,19502);
        mCountries[51] = new Country("Peru","PER",202596000000D,30973148,6541);
        mCountries[52] = new Country("New Zealand","NZL",199970000000D,4509700,44342);
        mCountries[53] = new Country("Romania","ROM",199044000000D,2172065,91638);
        mCountries[54] = new Country("Vietnam","VNM",186205000000D,4294682,43357);
        mCountries[55] = new Country("Bangladesh","BGD",172887000000D,159077513,1087);
        mCountries[56] = new Country("Kuwait","KWT",163612000000D,3753121,43594);
        mCountries[57] = new Country("Angola","AGO",138357000000D,24227524,5711);
        mCountries[58] = new Country("Hungary","HUN",138347000000D,9863183,14027);
        mCountries[59] = new Country("Ukraine","UKR",131805000000D,45362900,2906);
        mCountries[60] = new Country("Morocco","MAR",110009000000D,33921203,3243);
        mCountries[61] = new Country("Puerto Rico","PRI",103135000000D,3548397,29065);
        mCountries[62] = new Country("Ecuador","ECU",100917000000D,15902916,6346);
        mCountries[63] = new Country("Slovak Republic","SVK",100249000000D,5418649,18501);
        mCountries[64] = new Country("Oman","OMN",81797000000D,4236057,19310);
        mCountries[65] = new Country("Sri Lanka","LKA",78824000000D,20771000,3795);
        mCountries[66] = new Country("Cuba","CUB",77150000000D,11379111,6780);
        mCountries[67] = new Country("Belarus","BLR",76139000000D,9470000,8040);
        mCountries[68] = new Country("Azerbaijan","AZE",75198000000D,9535079,7886);
        mCountries[69] = new Country("Sudan","SDN",73815000000D,39350274,1876);
        mCountries[70] = new Country("Luxembourg","LUX",64874000000.D,556319,116613);
        mCountries[71] = new Country("Myanmar","MMR",64330000000D,53437159,1204);
        mCountries[72] = new Country("Dominican Republic","DOM",64138000000.D,10405943,6164);
        mCountries[73] = new Country("Uzbekistan","UZB",62644000000D,4294682,14586);
        mCountries[74] = new Country("Kenya","KEN",60937000000D,44863583,1358);
        mCountries[75] = new Country("Guatemala","GTM",58827000000D,16015494,3673);
        mCountries[76] = new Country("Uruguay","URY",57471000000D,4294682,13382);
        mCountries[77] = new Country("Croatia","HRV",57113000000D,4238389,13475);
        mCountries[78] = new Country("Bulgaria","BGR",56717000000D,7223938,7851);
        mCountries[79] = new Country("Ethiopia","ETH",55612000000D,96958732,574);
        mCountries[80] = new Country("Macao","MAC",55502000000D,577914,96039);
        mCountries[81] = new Country("Costa Rica","CRI",49553000000D,4757606,10416);
        mCountries[82] = new Country("Slovenia","SVN",49491000000D,2061980,24002);
        mCountries[83] = new Country("Tunisia","TUN",48613000000D,10996600,4421);
        mCountries[84] = new Country("Lithuania","LTU",48354000000D,2932367,16490);
        mCountries[85] = new Country("Tanzania","TZA",48057000000D,51822621,927);
        mCountries[86] = new Country("Turkmenistan","TKM",47932000000D,5307188,9032);
        mCountries[87] = new Country("Panama","PAN",46213000000D,3867535,11949);
        mCountries[88] = new Country("Lebanon","LBN",45731000000D,4546774,10058);
        mCountries[89] = new Country("Serbia","SRB",43866000000D,7129366,6153);
        mCountries[90] = new Country("Libya","LBY",41143000000D,6258984,6573);
        mCountries[91] = new Country("Ghana","GHA",38617000000D,26786598,1442);
        mCountries[92] = new Country("Yemen","YEM",35955000000D,26183676,1373);
        mCountries[93] = new Country("Jordan","JOR",35827000000D,6607000,5423);
        mCountries[94] = new Country("Coute d'Ivoire","CIV",34254000000.D,22157107,1546);
        mCountries[95] = new Country("Bahrain","BHR",33851000000D,1361930,24855);
        mCountries[96] = new Country("Congo","ZAR",33121000000.D,74877030,442);
        mCountries[97] = new Country("Bolivia","BOL",32996000000.D,10561887,3124);
        mCountries[98] = new Country("Cameroon","CMR",32051000000.D,22773014,1407);
        mCountries[99] = new Country("Latvia","LVA",31287000000D,1993782,15692);
        mCountries[100] = new Country("Paraguay","PRY",30881000000D,6552518,4713);
        mCountries[101] = new Country("Zambia","ZMB",27066000000D,15721343,1722);
        mCountries[102] = new Country("Uganda","UGA",26998000000D,37782971,715);
        mCountries[103] = new Country("Estonia","EST",26485000000D,1314545,20148);
        mCountries[104] = new Country("El Salvador","SLV",25164000000D,6107706,4120);
        mCountries[105] = new Country("Cyprus","CYP",23226000000D,1153658,20132);
        mCountries[106] = new Country("Afghanistan","AFG",20038000000D,103441,193714);
        mCountries[107] = new Country("Nepal","NPL",19770000000D,28174724,702);
        mCountries[108] = new Country("Honduras","HND",19385000000D,7961680,2435);
        mCountries[109] = new Country("Bosnia","BIH",18521000000D,3817554,4852);
        mCountries[110] = new Country("Gabon","GAB",18180000000D,1687673,10772);
        mCountries[111] = new Country("Brunei","BRN",17105000000D,417394,40980);
        mCountries[112] = new Country("Iceland","ISL",17036000000.D,327386,52036);
        mCountries[113] = new Country("New Guinea","PNG",16929000000.D,7463577,2268);
        mCountries[114] = new Country("Cambodia","KHM",16778000000.D,15328136,1095);
        mCountries[115] = new Country("Georgia","GEO",16530000000.D,3727000,4435);
        mCountries[116] = new Country("Mozambique","MOZ",15938000000D,27216276,586);
        mCountries[117] = new Country("Botswana","BWA",15813000000D,2219937,7123);
        mCountries[118] = new Country("Senegal","SEN",15658000000D,14672557,1067);
        mCountries[119] = new Country("Guinea","GNQ",15530000000D,820885,18919);
        mCountries[120] = new Country("Zimbabwe","ZWE",14197000000D,15245855,931);
        mCountries[121] = new Country("Chad","TCD",13922000000D,13587053,1025);
        mCountries[122] = new Country("Jamaica","JAM",13891000000D,2720554,5106);
        mCountries[123] = new Country("South Sudan","SSD",13282000000D,11911184,1115);
        mCountries[124] = new Country("Albania","ALB",13212000000D,2894475,4565);
        mCountries[125] = new Country("Namibia","NAM",12995000000D,2402858,5408);
        mCountries[126] = new Country("Mauritius","MUS",12630000000D,1260934,10016);
        mCountries[127] = new Country("Burkina Faso","BFA",12542000000D,17589198,713);
        mCountries[128] = new Country("Mali","MLI",12037000000D,17086022,704);
        mCountries[129] = new Country("Mongolia","MNG",12016000000D,2909871,4129);
        mCountries[130] = new Country("Nicaragua","NIC",11806000000D,6013913,1963);
        mCountries[131] = new Country("Armenia","ARM",11644000000D,3006154,3873);
        mCountries[132] = new Country("Macedonia","MKD",11324000000D,2075625,5456);
        mCountries[133] = new Country("Madagascar","MDG",10593000000D,23571713,449);
        mCountries[134] = new Country("Malta","MLT",9643000000D,427364,22564);
        mCountries[135] = new Country("Benin","BEN",9575000000D,10598482,903);
        mCountries[136] = new Country("Tajikistan","TJK",9242000000D,8295840,1114);
        mCountries[137] = new Country("Haiti","HTI",8713000000D,10572029,824);
        mCountries[138] = new Country("Bahamas","BHS",8511000000.D,383054,22219);
        mCountries[139] = new Country("Niger","NER",8169000000.D,19113728,427);
        mCountries[140] = new Country("Moldova","MDA",7962000000D,3556397,2239);
        mCountries[141] = new Country("Rwanda","RWA",7890000000D,11341544,696);
        mCountries[142] = new Country("Kyrgyzstan","KGZ",7404000000D,5835500,1269);
        mCountries[143] = new Country("Kosovo","KSV",7387000000D,1823149,4052);
        mCountries[144] = new Country("Guinea","GIN",6624000000D,12275527,540);
        mCountries[145] = new Country("Somalia","SOM",5707000000D,10517569,543);
        mCountries[146] = new Country("Bermuda","BMU",5574000000D,65181,85516);
        mCountries[147] = new Country("Liechtenstein","LIE",5488000000D,37286,147187);
        mCountries[148] = new Country("Suriname","SUR",5210000000D,538248,9680);
        mCountries[149] = new Country("Mauritania","MRT",5061000000D,3969625,1275);
        mCountries[150] = new Country("Sierra Leone","SLE",4838000000D,6315627,766);
        mCountries[151] = new Country("Montenegro","MNE",4588000000D,621810,7378);
        mCountries[152] = new Country("Fiji","FJI",4532000000D,886450,5113);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mQuestionTxt = (TextView) findViewById(R.id.question); //question
        mBtn1 = (Button) findViewById(R.id.btn1); //country 1 answer btn1
        mBtn2 = (Button) findViewById(R.id.btn2); //country 2 answer btn2
        mBtn3 = (Button) findViewById(R.id.btn3); //country answer 3 btn3
        mTxtScore = (TextView) findViewById(R.id.txt_score); //country mTxtScore
        mTxtAttempts = (TextView) findViewById(R.id.txt_user_attempts); //txt attempts

        //1. set countries and first question
        setCountries();
        setQuestion();

        //2a. set btn1 to submit 1
        mClickListener1 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submitAnswer(country1);
            }
        };
        mBtn1.setOnClickListener(mClickListener1);

        //2b. set btn2 to submit an answer of 2
        mClickListener2 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submitAnswer(country2);
            }
        };
        mBtn2.setOnClickListener(mClickListener2);

        //set btn3 to submit an answer of 3
        mClickListener3 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submitAnswer(country3);
            }
        };
        mBtn3.setOnClickListener(mClickListener3);

        //3 the submitAnswer method called above also calls the setQuestion and setCountries method, then updateScore method

    }

    protected void getRandomNumbers() {
        //getting 4 randos to rando-ly assign our answer choices and rando question
        Random rng = new Random();

        // per skeet - http://stackoverflow.com/questions/4040001/creating-random-numbers-with-no-duplicates
        Set<Integer> generated = new LinkedHashSet<>();

        while (generated.size() < 4) {
            Integer next = rng.nextInt(153);
            // sets have unique values; therefore no duplicates
            generated.add(next);
        }

        Integer[] randoms = generated.toArray(new Integer[generated.size()]);

        //our randos
        randomNumber1 = randoms[0];
        randomNumber2 = randoms[1];
        randomNumber3 = randoms[2];
        randomNumber4 = randoms[3];

    }

    protected void setQuestion() {
        //divide rando by 3 to get ~1/3rd probability for each of the 3 possible Qs
        questionType = (randomNumber4 % 3);
        if (questionType == 0) {
            mQuestionTxt.setText("What country has the largest economy?");
        }
        else if (questionType == 1) {
            mQuestionTxt.setText("What country has the largest population?");
        }
        else if (questionType == 2) {
            mQuestionTxt.setText("What country has the highest GDP per capita");
        }
    }

    protected void setCountries() {

        //get random numbers
        getRandomNumbers();

        //assign countries based on random numbers
        country1 = mCountries[randomNumber1];
        country2 = mCountries[randomNumber2];
        country3 = mCountries[randomNumber3];

        //assign text of btn1 to country1
        mBtn1.setText(country1.getmName());
        //assign text of btn2 to country2
        mBtn2.setText(country2.getmName());
        //assign text of btn3 to country3
        mBtn3.setText(country3.getmName());
    }

    private boolean submitAnswer(Country a) {
        answer = a;
        double maxValue0;
        double maxValue1;
        double maxValue2;

        switch (questionType) {
            //largest economy question
            case 0:
                maxValue0 = Math.max(country1.getmGDP(), Math.max(country2.getmGDP(), country3.getmGDP()));
                //because all values in data are unique, we can attempt to match values to assess correctness
                if (answer.getmGDP() == maxValue0) {
                    gotCorrectAnswer = true;
                } else {
                    gotCorrectAnswer = false;
                }

                break;
            //population question
            case 1:
                maxValue1 = Math.max(country1.getmPop(), Math.max(country2.getmPop(), country3.getmPop()));
                if (answer.getmPop() == maxValue1) {
                    gotCorrectAnswer = true;
                } else {
                    gotCorrectAnswer = false;
                }
                break;
            //GDP per capita question
            case 2:
                maxValue2 = Math.max(country1.getmGDPPerCapita(), Math.max(country2.getmGDPPerCapita(), country3.getmGDPPerCapita()));
                if (answer.getmPop() == maxValue2) {
                    gotCorrectAnswer = true;
                }else {
                    gotCorrectAnswer = false;
                }
                break;

        }

        String correctMsg = "Correct!";
        String incorrectMsg = "Wrong";

        if (gotCorrectAnswer) {
            mToast.makeText(getApplicationContext(), correctMsg, Toast.LENGTH_SHORT).show();
        } else {
            mToast.makeText(getApplicationContext(), incorrectMsg, Toast.LENGTH_SHORT).show();
        }

        //set another 3 countries
        setCountries();
        //set another question
        setQuestion();

        //update score
        updateScore(gotCorrectAnswer);
        return gotCorrectAnswer;
    }

    private void updateScore(boolean gotCorrectAnswer) {
        attempts++;
        if (gotCorrectAnswer) {
            score++;
        }

        mTxtAttempts.setText("Attempts: " + Integer.toString(attempts));
        mTxtScore.setText("Score: " + Integer.toString(score));
    }

}