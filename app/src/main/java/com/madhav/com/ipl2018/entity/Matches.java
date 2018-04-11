package com.madhav.com.ipl2018.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by madhav on 4/6/2018.
 */

public class Matches {

    /**
     * tournamentId : {"id":7749,"name":"ipl2018"}
     * schedule : [{"matchId":{"id":7894,"name":"ipl2018-01"},"description":"Match 1","matchDate":"2018-04-07T20:00:00+0530","matchType":"IPLT20","matchState":"U","venue":{"id":4,"fullName":"Wankhede Stadium","shortName":"Wankhede Stadium","city":"Mumbai","country":"India"},"team1":{"team":{"id":6,"fullName":"Mumbai Indians","shortName":"Mumbai","abbreviation":"MI","primaryColor":"00AEEF","secondaryColor":"FFFFFF","type":"m","typeString":"m"}},"team2":{"team":{"id":1,"fullName":"Chennai Super Kings","shortName":"Super Kings","abbreviation":"CSK","primaryColor":"FDB913","secondaryColor":"0081E5","type":"m","typeString":"m"}},"groupName":""},{"matchId":{"id":7895,"name":"ipl2018-02"},"description":"Match 2","matchDate":"2018-04-08T16:00:00+0530","matchType":"IPLT20","matchState":"U","venue":{"id":9,"fullName":"IS Bindra Stadium","shortName":"IS Bindra Stadium","city":"Mohali","country":"India"},"team1":{"team":{"id":4,"fullName":"Kings XI Punjab","shortName":"Kings XI","abbreviation":"KXIP","primaryColor":"DA1F3D","secondaryColor":"FFFFFF","type":"m","typeString":"m"}},"team2":{"team":{"id":3,"fullName":"Delhi Daredevils","shortName":"Daredevils","abbreviation":"DD","primaryColor":"004C93","secondaryColor":"F83430","type":"m","typeString":"m"}},"groupName":""},{"matchId":{"id":7896,"name":"ipl2018-03"},"description":"Match 3","matchDate":"2018-04-08T20:00:00+0530","matchType":"IPLT20","matchState":"U","venue":{"id":2,"fullName":"Eden Gardens","shortName":"Eden Gardens","city":"Kolkata","country":"India"},"team1":{"team":{"id":5,"fullName":"Kolkata Knight Riders","shortName":"Knight Riders","abbreviation":"KKR","primaryColor":"6F2C91","secondaryColor":"FFFFFF","type":"m","typeString":"m"}},"team2":{"team":{"id":9,"fullName":"Royal Challengers Bangalore","shortName":"Challengers","abbreviation":"RCB","primaryColor":"000000","secondaryColor":"FF3245","type":"m","typeString":"m"}},"groupName":""},{"matchId":{"id":7897,"name":"ipl2018-04"},"description":"Match 4","matchDate":"2018-04-09T20:00:00+0530","matchType":"IPLT20","matchState":"U","venue":{"id":10,"fullName":"Rajiv Gandhi Intl. Cricket Stadium","shortName":"Rajiv Gandhi Intl. Cricket Stadium","city":"Hyderabad","country":"India"},"team1":{"team":{"id":62,"fullName":"Sunrisers Hyderabad","shortName":"Sunrisers","abbreviation":"SRH","primaryColor":"FF9C00","secondaryColor":"FFFFFF","type":"m","typeString":"m"}},"team2":{"team":{"id":8,"fullName":"Rajasthan Royals","shortName":"Royals","abbreviation":"RR","primaryColor":"004B8C","secondaryColor":"FFFFFF","type":"m","typeString":"m"}},"groupName":""},{"matchId":{"id":7898,"name":"ipl2018-05"},"description":"Match 5","matchDate":"2018-04-10T20:00:00+0530","matchType":"IPLT20","matchState":"U","venue":{"id":1,"fullName":"M. A. Chidambaram Stadium","shortName":"Chidambaram","city":"Chennai","country":"India"},"team1":{"team":{"id":1,"fullName":"Chennai Super Kings","shortName":"Super Kings","abbreviation":"CSK","primaryColor":"FDB913","secondaryColor":"0081E5","type":"m","typeString":"m"}},"team2":{"team":{"id":5,"fullName":"Kolkata Knight Riders","shortName":"Knight Riders","abbreviation":"KKR","primaryColor":"6F2C91","secondaryColor":"FFFFFF","type":"m","typeString":"m"}},"groupName":""},{"matchId":{"id":7899,"name":"ipl2018-06"},"description":"Match 6","matchDate":"2018-04-11T20:00:00+0530","matchType":"IPLT20","matchState":"U","venue":{"id":3,"fullName":"Sawai Mansingh Stadium","shortName":"Sawai Mansingh Stadium","city":"Jaipur","country":"India"},"team1":{"team":{"id":8,"fullName":"Rajasthan Royals","shortName":"Royals","abbreviation":"RR","primaryColor":"004B8C","secondaryColor":"FFFFFF","type":"m","typeString":"m"}},"team2":{"team":{"id":3,"fullName":"Delhi Daredevils","shortName":"Daredevils","abbreviation":"DD","primaryColor":"004C93","secondaryColor":"F83430","type":"m","typeString":"m"}},"groupName":""},{"matchId":{"id":7900,"name":"ipl2018-07"},"description":"Match 7","matchDate":"2018-04-12T20:00:00+0530","matchType":"IPLT20","matchState":"U","venue":{"id":10,"fullName":"Rajiv Gandhi Intl. Cricket Stadium","shortName":"Rajiv Gandhi Intl. Cricket Stadium","city":"Hyderabad","country":"India"},"team1":{"team":{"id":62,"fullName":"Sunrisers Hyderabad","shortName":"Sunrisers","abbreviation":"SRH","primaryColor":"FF9C00","secondaryColor":"FFFFFF","type":"m","typeString":"m"}},"team2":{"team":{"id":6,"fullName":"Mumbai Indians","shortName":"Mumbai","abbreviation":"MI","primaryColor":"00AEEF","secondaryColor":"FFFFFF","type":"m","typeString":"m"}},"groupName":""},{"matchId":{"id":7901,"name":"ipl2018-08"},"description":"Match 8","matchDate":"2018-04-13T20:00:00+0530","matchType":"IPLT20","matchState":"U","venue":{"id":5,"fullName":"M. Chinnaswamy Stadium","shortName":"M. Chinnaswamy Stadium","city":"Bengaluru","country":"India"},"team1":{"team":{"id":9,"fullName":"Royal Challengers Bangalore","shortName":"Challengers","abbreviation":"RCB","primaryColor":"000000","secondaryColor":"FF3245","type":"m","typeString":"m"}},"team2":{"team":{"id":4,"fullName":"Kings XI Punjab","shortName":"Kings XI","abbreviation":"KXIP","primaryColor":"DA1F3D","secondaryColor":"FFFFFF","type":"m","typeString":"m"}},"groupName":""},{"matchId":{"id":7902,"name":"ipl2018-09"},"description":"Match 9","matchDate":"2018-04-14T16:00:00+0530","matchType":"IPLT20","matchState":"U","venue":{"id":4,"fullName":"Wankhede Stadium","shortName":"Wankhede Stadium","city":"Mumbai","country":"India"},"team1":{"team":{"id":6,"fullName":"Mumbai Indians","shortName":"Mumbai","abbreviation":"MI","primaryColor":"00AEEF","secondaryColor":"FFFFFF","type":"m","typeString":"m"}},"team2":{"team":{"id":3,"fullName":"Delhi Daredevils","shortName":"Daredevils","abbreviation":"DD","primaryColor":"004C93","secondaryColor":"F83430","type":"m","typeString":"m"}},"groupName":""},{"matchId":{"id":7903,"name":"ipl2018-10"},"description":"Match 10","matchDate":"2018-04-14T20:00:00+0530","matchType":"IPLT20","matchState":"U","venue":{"id":2,"fullName":"Eden Gardens","shortName":"Eden Gardens","city":"Kolkata","country":"India"},"team1":{"team":{"id":5,"fullName":"Kolkata Knight Riders","shortName":"Knight Riders","abbreviation":"KKR","primaryColor":"6F2C91","secondaryColor":"FFFFFF","type":"m","typeString":"m"}},"team2":{"team":{"id":62,"fullName":"Sunrisers Hyderabad","shortName":"Sunrisers","abbreviation":"SRH","primaryColor":"FF9C00","secondaryColor":"FFFFFF","type":"m","typeString":"m"}},"groupName":""},{"matchId":{"id":7904,"name":"ipl2018-11"},"description":"Match 11","matchDate":"2018-04-15T16:00:00+0530","matchType":"IPLT20","matchState":"U","venue":{"id":5,"fullName":"M. Chinnaswamy Stadium","shortName":"M. Chinnaswamy Stadium","city":"Bengaluru","country":"India"},"team1":{"team":{"id":9,"fullName":"Royal Challengers Bangalore","shortName":"Challengers","abbreviation":"RCB","primaryColor":"000000","secondaryColor":"FF3245","type":"m","typeString":"m"}},"team2":{"team":{"id":8,"fullName":"Rajasthan Royals","shortName":"Royals","abbreviation":"RR","primaryColor":"004B8C","secondaryColor":"FFFFFF","type":"m","typeString":"m"}},"groupName":""},{"matchId":{"id":7905,"name":"ipl2018-12"},"description":"Match 12","matchDate":"2018-04-15T20:00:00+0530","matchType":"IPLT20","matchState":"U","venue":{"id":9,"fullName":"IS Bindra Stadium","shortName":"IS Bindra Stadium","city":"Mohali","country":"India"},"team1":{"team":{"id":4,"fullName":"Kings XI Punjab","shortName":"Kings XI","abbreviation":"KXIP","primaryColor":"DA1F3D","secondaryColor":"FFFFFF","type":"m","typeString":"m"}},"team2":{"team":{"id":1,"fullName":"Chennai Super Kings","shortName":"Super Kings","abbreviation":"CSK","primaryColor":"FDB913","secondaryColor":"0081E5","type":"m","typeString":"m"}},"groupName":""},{"matchId":{"id":7906,"name":"ipl2018-13"},"description":"Match 13","matchDate":"2018-04-16T20:00:00+0530","matchType":"IPLT20","matchState":"U","venue":{"id":2,"fullName":"Eden Gardens","shortName":"Eden Gardens","city":"Kolkata","country":"India"},"team1":{"team":{"id":5,"fullName":"Kolkata Knight Riders","shortName":"Knight Riders","abbreviation":"KKR","primaryColor":"6F2C91","secondaryColor":"FFFFFF","type":"m","typeString":"m"}},"team2":{"team":{"id":3,"fullName":"Delhi Daredevils","shortName":"Daredevils","abbreviation":"DD","primaryColor":"004C93","secondaryColor":"F83430","type":"m","typeString":"m"}},"groupName":""},{"matchId":{"id":7907,"name":"ipl2018-14"},"description":"Match 14","matchDate":"2018-04-17T20:00:00+0530","matchType":"IPLT20","matchState":"U","venue":{"id":4,"fullName":"Wankhede Stadium","shortName":"Wankhede Stadium","city":"Mumbai","country":"India"},"team1":{"team":{"id":6,"fullName":"Mumbai Indians","shortName":"Mumbai","abbreviation":"MI","primaryColor":"00AEEF","secondaryColor":"FFFFFF","type":"m","typeString":"m"}},"team2":{"team":{"id":9,"fullName":"Royal Challengers Bangalore","shortName":"Challengers","abbreviation":"RCB","primaryColor":"000000","secondaryColor":"FF3245","type":"m","typeString":"m"}},"groupName":""},{"matchId":{"id":7908,"name":"ipl2018-15"},"description":"Match 15","matchDate":"2018-04-18T20:00:00+0530","matchType":"IPLT20","matchState":"U","venue":{"id":3,"fullName":"Sawai Mansingh Stadium","shortName":"Sawai Mansingh Stadium","city":"Jaipur","country":"India"},"team1":{"team":{"id":8,"fullName":"Rajasthan Royals","shortName":"Royals","abbreviation":"RR","primaryColor":"004B8C","secondaryColor":"FFFFFF","type":"m","typeString":"m"}},"team2":{"team":{"id":5,"fullName":"Kolkata Knight Riders","shortName":"Knight Riders","abbreviation":"KKR","primaryColor":"6F2C91","secondaryColor":"FFFFFF","type":"m","typeString":"m"}},"groupName":""},{"matchId":{"id":7909,"name":"ipl2018-16"},"description":"Match 16","matchDate":"2018-04-19T20:00:00+0530","matchType":"IPLT20","matchState":"U","venue":{"id":9,"fullName":"IS Bindra Stadium","shortName":"IS Bindra Stadium","city":"Mohali","country":"India"},"team1":{"team":{"id":4,"fullName":"Kings XI Punjab","shortName":"Kings XI","abbreviation":"KXIP","primaryColor":"DA1F3D","secondaryColor":"FFFFFF","type":"m","typeString":"m"}},"team2":{"team":{"id":62,"fullName":"Sunrisers Hyderabad","shortName":"Sunrisers","abbreviation":"SRH","primaryColor":"FF9C00","secondaryColor":"FFFFFF","type":"m","typeString":"m"}},"groupName":""},{"matchId":{"id":7910,"name":"ipl2018-17"},"description":"Match 17","matchDate":"2018-04-20T20:00:00+0530","matchType":"IPLT20","matchState":"U","venue":{"id":1,"fullName":"M. A. Chidambaram Stadium","shortName":"Chidambaram","city":"Chennai","country":"India"},"team1":{"team":{"id":1,"fullName":"Chennai Super Kings","shortName":"Super Kings","abbreviation":"CSK","primaryColor":"FDB913","secondaryColor":"0081E5","type":"m","typeString":"m"}},"team2":{"team":{"id":8,"fullName":"Rajasthan Royals","shortName":"Royals","abbreviation":"RR","primaryColor":"004B8C","secondaryColor":"FFFFFF","type":"m","typeString":"m"}},"groupName":""},{"matchId":{"id":7911,"name":"ipl2018-18"},"description":"Match 18","matchDate":"2018-04-21T16:00:00+0530","matchType":"IPLT20","matchState":"U","venue":{"id":2,"fullName":"Eden Gardens","shortName":"Eden Gardens","city":"Kolkata","country":"India"},"team1":{"team":{"id":5,"fullName":"Kolkata Knight Riders","shortName":"Knight Riders","abbreviation":"KKR","primaryColor":"6F2C91","secondaryColor":"FFFFFF","type":"m","typeString":"m"}},"team2":{"team":{"id":4,"fullName":"Kings XI Punjab","shortName":"Kings XI","abbreviation":"KXIP","primaryColor":"DA1F3D","secondaryColor":"FFFFFF","type":"m","typeString":"m"}},"groupName":""},{"matchId":{"id":7912,"name":"ipl2018-19"},"description":"Match 19","matchDate":"2018-04-21T20:00:00+0530","matchType":"IPLT20","matchState":"U","venue":{"id":5,"fullName":"M. Chinnaswamy Stadium","shortName":"M. Chinnaswamy Stadium","city":"Bengaluru","country":"India"},"team1":{"team":{"id":9,"fullName":"Royal Challengers Bangalore","shortName":"Challengers","abbreviation":"RCB","primaryColor":"000000","secondaryColor":"FF3245","type":"m","typeString":"m"}},"team2":{"team":{"id":3,"fullName":"Delhi Daredevils","shortName":"Daredevils","abbreviation":"DD","primaryColor":"004C93","secondaryColor":"F83430","type":"m","typeString":"m"}},"groupName":""},{"matchId":{"id":7913,"name":"ipl2018-20"},"description":"Match 20","matchDate":"2018-04-22T16:00:00+0530","matchType":"IPLT20","matchState":"U","venue":{"id":10,"fullName":"Rajiv Gandhi Intl. Cricket Stadium","shortName":"Rajiv Gandhi Intl. Cricket Stadium","city":"Hyderabad","country":"India"},"team1":{"team":{"id":62,"fullName":"Sunrisers Hyderabad","shortName":"Sunrisers","abbreviation":"SRH","primaryColor":"FF9C00","secondaryColor":"FFFFFF","type":"m","typeString":"m"}},"team2":{"team":{"id":1,"fullName":"Chennai Super Kings","shortName":"Super Kings","abbreviation":"CSK","primaryColor":"FDB913","secondaryColor":"0081E5","type":"m","typeString":"m"}},"groupName":""},{"matchId":{"id":7914,"name":"ipl2018-21"},"description":"Match 21","matchDate":"2018-04-22T20:00:00+0530","matchType":"IPLT20","matchState":"U","venue":{"id":3,"fullName":"Sawai Mansingh Stadium","shortName":"Sawai Mansingh Stadium","city":"Jaipur","country":"India"},"team1":{"team":{"id":8,"fullName":"Rajasthan Royals","shortName":"Royals","abbreviation":"RR","primaryColor":"004B8C","secondaryColor":"FFFFFF","type":"m","typeString":"m"}},"team2":{"team":{"id":6,"fullName":"Mumbai Indians","shortName":"Mumbai","abbreviation":"MI","primaryColor":"00AEEF","secondaryColor":"FFFFFF","type":"m","typeString":"m"}},"groupName":""},{"matchId":{"id":7915,"name":"ipl2018-22"},"description":"Match 22","matchDate":"2018-04-23T20:00:00+0530","matchType":"IPLT20","matchState":"U","venue":{"id":8,"fullName":"Feroz Shah Kotla Ground","shortName":"Feroz Shah Kotla Ground","city":"Delhi","country":"India"},"team1":{"team":{"id":3,"fullName":"Delhi Daredevils","shortName":"Daredevils","abbreviation":"DD","primaryColor":"004C93","secondaryColor":"F83430","type":"m","typeString":"m"}},"team2":{"team":{"id":4,"fullName":"Kings XI Punjab","shortName":"Kings XI","abbreviation":"KXIP","primaryColor":"DA1F3D","secondaryColor":"FFFFFF","type":"m","typeString":"m"}},"groupName":""},{"matchId":{"id":7916,"name":"ipl2018-23"},"description":"Match 23","matchDate":"2018-04-24T20:00:00+0530","matchType":"IPLT20","matchState":"U","venue":{"id":4,"fullName":"Wankhede Stadium","shortName":"Wankhede Stadium","city":"Mumbai","country":"India"},"team1":{"team":{"id":6,"fullName":"Mumbai Indians","shortName":"Mumbai","abbreviation":"MI","primaryColor":"00AEEF","secondaryColor":"FFFFFF","type":"m","typeString":"m"}},"team2":{"team":{"id":62,"fullName":"Sunrisers Hyderabad","shortName":"Sunrisers","abbreviation":"SRH","primaryColor":"FF9C00","secondaryColor":"FFFFFF","type":"m","typeString":"m"}},"groupName":""},{"matchId":{"id":7917,"name":"ipl2018-24"},"description":"Match 24","matchDate":"2018-04-25T20:00:00+0530","matchType":"IPLT20","matchState":"U","venue":{"id":5,"fullName":"M. Chinnaswamy Stadium","shortName":"M. Chinnaswamy Stadium","city":"Bengaluru","country":"India"},"team1":{"team":{"id":9,"fullName":"Royal Challengers Bangalore","shortName":"Challengers","abbreviation":"RCB","primaryColor":"000000","secondaryColor":"FF3245","type":"m","typeString":"m"}},"team2":{"team":{"id":1,"fullName":"Chennai Super Kings","shortName":"Super Kings","abbreviation":"CSK","primaryColor":"FDB913","secondaryColor":"0081E5","type":"m","typeString":"m"}},"groupName":""},{"matchId":{"id":7918,"name":"ipl2018-25"},"description":"Match 25","matchDate":"2018-04-26T20:00:00+0530","matchType":"IPLT20","matchState":"U","venue":{"id":10,"fullName":"Rajiv Gandhi Intl. Cricket Stadium","shortName":"Rajiv Gandhi Intl. Cricket Stadium","city":"Hyderabad","country":"India"},"team1":{"team":{"id":62,"fullName":"Sunrisers Hyderabad","shortName":"Sunrisers","abbreviation":"SRH","primaryColor":"FF9C00","secondaryColor":"FFFFFF","type":"m","typeString":"m"}},"team2":{"team":{"id":4,"fullName":"Kings XI Punjab","shortName":"Kings XI","abbreviation":"KXIP","primaryColor":"DA1F3D","secondaryColor":"FFFFFF","type":"m","typeString":"m"}},"groupName":""},{"matchId":{"id":7919,"name":"ipl2018-26"},"description":"Match 26","matchDate":"2018-04-27T20:00:00+0530","matchType":"IPLT20","matchState":"U","venue":{"id":8,"fullName":"Feroz Shah Kotla Ground","shortName":"Feroz Shah Kotla Ground","city":"Delhi","country":"India"},"team1":{"team":{"id":3,"fullName":"Delhi Daredevils","shortName":"Daredevils","abbreviation":"DD","primaryColor":"004C93","secondaryColor":"F83430","type":"m","typeString":"m"}},"team2":{"team":{"id":5,"fullName":"Kolkata Knight Riders","shortName":"Knight Riders","abbreviation":"KKR","primaryColor":"6F2C91","secondaryColor":"FFFFFF","type":"m","typeString":"m"}},"groupName":""},{"matchId":{"id":7920,"name":"ipl2018-27"},"description":"Match 27","matchDate":"2018-04-28T20:00:00+0530","matchType":"IPLT20","matchState":"U","venue":{"id":1,"fullName":"M. A. Chidambaram Stadium","shortName":"Chidambaram","city":"Chennai","country":"India"},"team1":{"team":{"id":1,"fullName":"Chennai Super Kings","shortName":"Super Kings","abbreviation":"CSK","primaryColor":"FDB913","secondaryColor":"0081E5","type":"m","typeString":"m"}},"team2":{"team":{"id":6,"fullName":"Mumbai Indians","shortName":"Mumbai","abbreviation":"MI","primaryColor":"00AEEF","secondaryColor":"FFFFFF","type":"m","typeString":"m"}},"groupName":""},{"matchId":{"id":7921,"name":"ipl2018-28"},"description":"Match 28","matchDate":"2018-04-29T16:00:00+0530","matchType":"IPLT20","matchState":"U","venue":{"id":3,"fullName":"Sawai Mansingh Stadium","shortName":"Sawai Mansingh Stadium","city":"Jaipur","country":"India"},"team1":{"team":{"id":8,"fullName":"Rajasthan Royals","shortName":"Royals","abbreviation":"RR","primaryColor":"004B8C","secondaryColor":"FFFFFF","type":"m","typeString":"m"}},"team2":{"team":{"id":62,"fullName":"Sunrisers Hyderabad","shortName":"Sunrisers","abbreviation":"SRH","primaryColor":"FF9C00","secondaryColor":"FFFFFF","type":"m","typeString":"m"}},"groupName":""},{"matchId":{"id":7922,"name":"ipl2018-29"},"description":"Match 29","matchDate":"2018-04-29T20:00:00+0530","matchType":"IPLT20","matchState":"U","venue":{"id":5,"fullName":"M. Chinnaswamy Stadium","shortName":"M. Chinnaswamy Stadium","city":"Bengaluru","country":"India"},"team1":{"team":{"id":9,"fullName":"Royal Challengers Bangalore","shortName":"Challengers","abbreviation":"RCB","primaryColor":"000000","secondaryColor":"FF3245","type":"m","typeString":"m"}},"team2":{"team":{"id":5,"fullName":"Kolkata Knight Riders","shortName":"Knight Riders","abbreviation":"KKR","primaryColor":"6F2C91","secondaryColor":"FFFFFF","type":"m","typeString":"m"}},"groupName":""},{"matchId":{"id":7923,"name":"ipl2018-30"},"description":"Match 30","matchDate":"2018-04-30T20:00:00+0530","matchType":"IPLT20","matchState":"U","venue":{"id":1,"fullName":"M. A. Chidambaram Stadium","shortName":"Chidambaram","city":"Chennai","country":"India"},"team1":{"team":{"id":1,"fullName":"Chennai Super Kings","shortName":"Super Kings","abbreviation":"CSK","primaryColor":"FDB913","secondaryColor":"0081E5","type":"m","typeString":"m"}},"team2":{"team":{"id":3,"fullName":"Delhi Daredevils","shortName":"Daredevils","abbreviation":"DD","primaryColor":"004C93","secondaryColor":"F83430","type":"m","typeString":"m"}},"groupName":""},{"matchId":{"id":7924,"name":"ipl2018-31"},"description":"Match 31","matchDate":"2018-05-01T20:00:00+0530","matchType":"IPLT20","matchState":"U","venue":{"id":5,"fullName":"M. Chinnaswamy Stadium","shortName":"M. Chinnaswamy Stadium","city":"Bengaluru","country":"India"},"team1":{"team":{"id":9,"fullName":"Royal Challengers Bangalore","shortName":"Challengers","abbreviation":"RCB","primaryColor":"000000","secondaryColor":"FF3245","type":"m","typeString":"m"}},"team2":{"team":{"id":6,"fullName":"Mumbai Indians","shortName":"Mumbai","abbreviation":"MI","primaryColor":"00AEEF","secondaryColor":"FFFFFF","type":"m","typeString":"m"}},"groupName":""},{"matchId":{"id":7925,"name":"ipl2018-32"},"description":"Match 32","matchDate":"2018-05-02T20:00:00+0530","matchType":"IPLT20","matchState":"U","venue":{"id":8,"fullName":"Feroz Shah Kotla Ground","shortName":"Feroz Shah Kotla Ground","city":"Delhi","country":"India"},"team1":{"team":{"id":3,"fullName":"Delhi Daredevils","shortName":"Daredevils","abbreviation":"DD","primaryColor":"004C93","secondaryColor":"F83430","type":"m","typeString":"m"}},"team2":{"team":{"id":8,"fullName":"Rajasthan Royals","shortName":"Royals","abbreviation":"RR","primaryColor":"004B8C","secondaryColor":"FFFFFF","type":"m","typeString":"m"}},"groupName":""},{"matchId":{"id":7926,"name":"ipl2018-33"},"description":"Match 33","matchDate":"2018-05-03T20:00:00+0530","matchType":"IPLT20","matchState":"U","venue":{"id":2,"fullName":"Eden Gardens","shortName":"Eden Gardens","city":"Kolkata","country":"India"},"team1":{"team":{"id":5,"fullName":"Kolkata Knight Riders","shortName":"Knight Riders","abbreviation":"KKR","primaryColor":"6F2C91","secondaryColor":"FFFFFF","type":"m","typeString":"m"}},"team2":{"team":{"id":1,"fullName":"Chennai Super Kings","shortName":"Super Kings","abbreviation":"CSK","primaryColor":"FDB913","secondaryColor":"0081E5","type":"m","typeString":"m"}},"groupName":""},{"matchId":{"id":7927,"name":"ipl2018-34"},"description":"Match 34","matchDate":"2018-05-04T20:00:00+0530","matchType":"IPLT20","matchState":"U","venue":{"id":17,"fullName":"Holkar Cricket Stadium","shortName":"Holkar Cricket Stadium","city":"Indore","country":"India"},"team1":{"team":{"id":4,"fullName":"Kings XI Punjab","shortName":"Kings XI","abbreviation":"KXIP","primaryColor":"DA1F3D","secondaryColor":"FFFFFF","type":"m","typeString":"m"}},"team2":{"team":{"id":6,"fullName":"Mumbai Indians","shortName":"Mumbai","abbreviation":"MI","primaryColor":"00AEEF","secondaryColor":"FFFFFF","type":"m","typeString":"m"}},"groupName":""},{"matchId":{"id":7928,"name":"ipl2018-35"},"description":"Match 35","matchDate":"2018-05-05T16:00:00+0530","matchType":"IPLT20","matchState":"U","venue":{"id":1,"fullName":"M. A. Chidambaram Stadium","shortName":"Chidambaram","city":"Chennai","country":"India"},"team1":{"team":{"id":1,"fullName":"Chennai Super Kings","shortName":"Super Kings","abbreviation":"CSK","primaryColor":"FDB913","secondaryColor":"0081E5","type":"m","typeString":"m"}},"team2":{"team":{"id":9,"fullName":"Royal Challengers Bangalore","shortName":"Challengers","abbreviation":"RCB","primaryColor":"000000","secondaryColor":"FF3245","type":"m","typeString":"m"}},"groupName":""},{"matchId":{"id":7929,"name":"ipl2018-36"},"description":"Match 36","matchDate":"2018-05-05T20:00:00+0530","matchType":"IPLT20","matchState":"U","venue":{"id":10,"fullName":"Rajiv Gandhi Intl. Cricket Stadium","shortName":"Rajiv Gandhi Intl. Cricket Stadium","city":"Hyderabad","country":"India"},"team1":{"team":{"id":62,"fullName":"Sunrisers Hyderabad","shortName":"Sunrisers","abbreviation":"SRH","primaryColor":"FF9C00","secondaryColor":"FFFFFF","type":"m","typeString":"m"}},"team2":{"team":{"id":3,"fullName":"Delhi Daredevils","shortName":"Daredevils","abbreviation":"DD","primaryColor":"004C93","secondaryColor":"F83430","type":"m","typeString":"m"}},"groupName":""},{"matchId":{"id":7930,"name":"ipl2018-37"},"description":"Match 37","matchDate":"2018-05-06T16:00:00+0530","matchType":"IPLT20","matchState":"U","venue":{"id":4,"fullName":"Wankhede Stadium","shortName":"Wankhede Stadium","city":"Mumbai","country":"India"},"team1":{"team":{"id":6,"fullName":"Mumbai Indians","shortName":"Mumbai","abbreviation":"MI","primaryColor":"00AEEF","secondaryColor":"FFFFFF","type":"m","typeString":"m"}},"team2":{"team":{"id":5,"fullName":"Kolkata Knight Riders","shortName":"Knight Riders","abbreviation":"KKR","primaryColor":"6F2C91","secondaryColor":"FFFFFF","type":"m","typeString":"m"}},"groupName":""},{"matchId":{"id":7931,"name":"ipl2018-38"},"description":"Match 38","matchDate":"2018-05-06T20:00:00+0530","matchType":"IPLT20","matchState":"U","venue":{"id":17,"fullName":"Holkar Cricket Stadium","shortName":"Holkar Cricket Stadium","city":"Indore","country":"India"},"team1":{"team":{"id":4,"fullName":"Kings XI Punjab","shortName":"Kings XI","abbreviation":"KXIP","primaryColor":"DA1F3D","secondaryColor":"FFFFFF","type":"m","typeString":"m"}},"team2":{"team":{"id":8,"fullName":"Rajasthan Royals","shortName":"Royals","abbreviation":"RR","primaryColor":"004B8C","secondaryColor":"FFFFFF","type":"m","typeString":"m"}},"groupName":""},{"matchId":{"id":7932,"name":"ipl2018-39"},"description":"Match 39","matchDate":"2018-05-07T20:00:00+0530","matchType":"IPLT20","matchState":"U","venue":{"id":10,"fullName":"Rajiv Gandhi Intl. Cricket Stadium","shortName":"Rajiv Gandhi Intl. Cricket Stadium","city":"Hyderabad","country":"India"},"team1":{"team":{"id":62,"fullName":"Sunrisers Hyderabad","shortName":"Sunrisers","abbreviation":"SRH","primaryColor":"FF9C00","secondaryColor":"FFFFFF","type":"m","typeString":"m"}},"team2":{"team":{"id":9,"fullName":"Royal Challengers Bangalore","shortName":"Challengers","abbreviation":"RCB","primaryColor":"000000","secondaryColor":"FF3245","type":"m","typeString":"m"}},"groupName":""},{"matchId":{"id":7933,"name":"ipl2018-40"},"description":"Match 40","matchDate":"2018-05-08T20:00:00+0530","matchType":"IPLT20","matchState":"U","venue":{"id":3,"fullName":"Sawai Mansingh Stadium","shortName":"Sawai Mansingh Stadium","city":"Jaipur","country":"India"},"team1":{"team":{"id":8,"fullName":"Rajasthan Royals","shortName":"Royals","abbreviation":"RR","primaryColor":"004B8C","secondaryColor":"FFFFFF","type":"m","typeString":"m"}},"team2":{"team":{"id":4,"fullName":"Kings XI Punjab","shortName":"Kings XI","abbreviation":"KXIP","primaryColor":"DA1F3D","secondaryColor":"FFFFFF","type":"m","typeString":"m"}},"groupName":""},{"matchId":{"id":7934,"name":"ipl2018-41"},"description":"Match 41","matchDate":"2018-05-09T20:00:00+0530","matchType":"IPLT20","matchState":"U","venue":{"id":2,"fullName":"Eden Gardens","shortName":"Eden Gardens","city":"Kolkata","country":"India"},"team1":{"team":{"id":5,"fullName":"Kolkata Knight Riders","shortName":"Knight Riders","abbreviation":"KKR","primaryColor":"6F2C91","secondaryColor":"FFFFFF","type":"m","typeString":"m"}},"team2":{"team":{"id":6,"fullName":"Mumbai Indians","shortName":"Mumbai","abbreviation":"MI","primaryColor":"00AEEF","secondaryColor":"FFFFFF","type":"m","typeString":"m"}},"groupName":""},{"matchId":{"id":7935,"name":"ipl2018-42"},"description":"Match 42","matchDate":"2018-05-10T20:00:00+0530","matchType":"IPLT20","matchState":"U","venue":{"id":8,"fullName":"Feroz Shah Kotla Ground","shortName":"Feroz Shah Kotla Ground","city":"Delhi","country":"India"},"team1":{"team":{"id":3,"fullName":"Delhi Daredevils","shortName":"Daredevils","abbreviation":"DD","primaryColor":"004C93","secondaryColor":"F83430","type":"m","typeString":"m"}},"team2":{"team":{"id":62,"fullName":"Sunrisers Hyderabad","shortName":"Sunrisers","abbreviation":"SRH","primaryColor":"FF9C00","secondaryColor":"FFFFFF","type":"m","typeString":"m"}},"groupName":""},{"matchId":{"id":7936,"name":"ipl2018-43"},"description":"Match 43","matchDate":"2018-05-11T20:00:00+0530","matchType":"IPLT20","matchState":"U","venue":{"id":3,"fullName":"Sawai Mansingh Stadium","shortName":"Sawai Mansingh Stadium","city":"Jaipur","country":"India"},"team1":{"team":{"id":8,"fullName":"Rajasthan Royals","shortName":"Royals","abbreviation":"RR","primaryColor":"004B8C","secondaryColor":"FFFFFF","type":"m","typeString":"m"}},"team2":{"team":{"id":1,"fullName":"Chennai Super Kings","shortName":"Super Kings","abbreviation":"CSK","primaryColor":"FDB913","secondaryColor":"0081E5","type":"m","typeString":"m"}},"groupName":""},{"matchId":{"id":7937,"name":"ipl2018-44"},"description":"Match 44","matchDate":"2018-05-12T16:00:00+0530","matchType":"IPLT20","matchState":"U","venue":{"id":17,"fullName":"Holkar Cricket Stadium","shortName":"Holkar Cricket Stadium","city":"Indore","country":"India"},"team1":{"team":{"id":4,"fullName":"Kings XI Punjab","shortName":"Kings XI","abbreviation":"KXIP","primaryColor":"DA1F3D","secondaryColor":"FFFFFF","type":"m","typeString":"m"}},"team2":{"team":{"id":5,"fullName":"Kolkata Knight Riders","shortName":"Knight Riders","abbreviation":"KKR","primaryColor":"6F2C91","secondaryColor":"FFFFFF","type":"m","typeString":"m"}},"groupName":""},{"matchId":{"id":7938,"name":"ipl2018-45"},"description":"Match 45","matchDate":"2018-05-12T20:00:00+0530","matchType":"IPLT20","matchState":"U","venue":{"id":8,"fullName":"Feroz Shah Kotla Ground","shortName":"Feroz Shah Kotla Ground","city":"Delhi","country":"India"},"team1":{"team":{"id":3,"fullName":"Delhi Daredevils","shortName":"Daredevils","abbreviation":"DD","primaryColor":"004C93","secondaryColor":"F83430","type":"m","typeString":"m"}},"team2":{"team":{"id":9,"fullName":"Royal Challengers Bangalore","shortName":"Challengers","abbreviation":"RCB","primaryColor":"000000","secondaryColor":"FF3245","type":"m","typeString":"m"}},"groupName":""},{"matchId":{"id":7939,"name":"ipl2018-46"},"description":"Match 46","matchDate":"2018-05-13T16:00:00+0530","matchType":"IPLT20","matchState":"U","venue":{"id":1,"fullName":"M. A. Chidambaram Stadium","shortName":"Chidambaram","city":"Chennai","country":"India"},"team1":{"team":{"id":1,"fullName":"Chennai Super Kings","shortName":"Super Kings","abbreviation":"CSK","primaryColor":"FDB913","secondaryColor":"0081E5","type":"m","typeString":"m"}},"team2":{"team":{"id":62,"fullName":"Sunrisers Hyderabad","shortName":"Sunrisers","abbreviation":"SRH","primaryColor":"FF9C00","secondaryColor":"FFFFFF","type":"m","typeString":"m"}},"groupName":""},{"matchId":{"id":7940,"name":"ipl2018-47"},"description":"Match 47","matchDate":"2018-05-13T20:00:00+0530","matchType":"IPLT20","matchState":"U","venue":{"id":4,"fullName":"Wankhede Stadium","shortName":"Wankhede Stadium","city":"Mumbai","country":"India"},"team1":{"team":{"id":6,"fullName":"Mumbai Indians","shortName":"Mumbai","abbreviation":"MI","primaryColor":"00AEEF","secondaryColor":"FFFFFF","type":"m","typeString":"m"}},"team2":{"team":{"id":8,"fullName":"Rajasthan Royals","shortName":"Royals","abbreviation":"RR","primaryColor":"004B8C","secondaryColor":"FFFFFF","type":"m","typeString":"m"}},"groupName":""},{"matchId":{"id":7941,"name":"ipl2018-48"},"description":"Match 48","matchDate":"2018-05-14T20:00:00+0530","matchType":"IPLT20","matchState":"U","venue":{"id":17,"fullName":"Holkar Cricket Stadium","shortName":"Holkar Cricket Stadium","city":"Indore","country":"India"},"team1":{"team":{"id":4,"fullName":"Kings XI Punjab","shortName":"Kings XI","abbreviation":"KXIP","primaryColor":"DA1F3D","secondaryColor":"FFFFFF","type":"m","typeString":"m"}},"team2":{"team":{"id":9,"fullName":"Royal Challengers Bangalore","shortName":"Challengers","abbreviation":"RCB","primaryColor":"000000","secondaryColor":"FF3245","type":"m","typeString":"m"}},"groupName":""},{"matchId":{"id":7942,"name":"ipl2018-49"},"description":"Match 49","matchDate":"2018-05-15T20:00:00+0530","matchType":"IPLT20","matchState":"U","venue":{"id":2,"fullName":"Eden Gardens","shortName":"Eden Gardens","city":"Kolkata","country":"India"},"team1":{"team":{"id":5,"fullName":"Kolkata Knight Riders","shortName":"Knight Riders","abbreviation":"KKR","primaryColor":"6F2C91","secondaryColor":"FFFFFF","type":"m","typeString":"m"}},"team2":{"team":{"id":8,"fullName":"Rajasthan Royals","shortName":"Royals","abbreviation":"RR","primaryColor":"004B8C","secondaryColor":"FFFFFF","type":"m","typeString":"m"}},"groupName":""},{"matchId":{"id":7943,"name":"ipl2018-50"},"description":"Match 50","matchDate":"2018-05-16T20:00:00+0530","matchType":"IPLT20","matchState":"U","venue":{"id":4,"fullName":"Wankhede Stadium","shortName":"Wankhede Stadium","city":"Mumbai","country":"India"},"team1":{"team":{"id":6,"fullName":"Mumbai Indians","shortName":"Mumbai","abbreviation":"MI","primaryColor":"00AEEF","secondaryColor":"FFFFFF","type":"m","typeString":"m"}},"team2":{"team":{"id":4,"fullName":"Kings XI Punjab","shortName":"Kings XI","abbreviation":"KXIP","primaryColor":"DA1F3D","secondaryColor":"FFFFFF","type":"m","typeString":"m"}},"groupName":""},{"matchId":{"id":7944,"name":"ipl2018-51"},"description":"Match 51","matchDate":"2018-05-17T20:00:00+0530","matchType":"IPLT20","matchState":"U","venue":{"id":5,"fullName":"M. Chinnaswamy Stadium","shortName":"M. Chinnaswamy Stadium","city":"Bengaluru","country":"India"},"team1":{"team":{"id":9,"fullName":"Royal Challengers Bangalore","shortName":"Challengers","abbreviation":"RCB","primaryColor":"000000","secondaryColor":"FF3245","type":"m","typeString":"m"}},"team2":{"team":{"id":62,"fullName":"Sunrisers Hyderabad","shortName":"Sunrisers","abbreviation":"SRH","primaryColor":"FF9C00","secondaryColor":"FFFFFF","type":"m","typeString":"m"}},"groupName":""},{"matchId":{"id":7945,"name":"ipl2018-52"},"description":"Match 52","matchDate":"2018-05-18T20:00:00+0530","matchType":"IPLT20","matchState":"U","venue":{"id":8,"fullName":"Feroz Shah Kotla Ground","shortName":"Feroz Shah Kotla Ground","city":"Delhi","country":"India"},"team1":{"team":{"id":3,"fullName":"Delhi Daredevils","shortName":"Daredevils","abbreviation":"DD","primaryColor":"004C93","secondaryColor":"F83430","type":"m","typeString":"m"}},"team2":{"team":{"id":1,"fullName":"Chennai Super Kings","shortName":"Super Kings","abbreviation":"CSK","primaryColor":"FDB913","secondaryColor":"0081E5","type":"m","typeString":"m"}},"groupName":""},{"matchId":{"id":7946,"name":"ipl2018-53"},"description":"Match 53","matchDate":"2018-05-19T16:00:00+0530","matchType":"IPLT20","matchState":"U","venue":{"id":3,"fullName":"Sawai Mansingh Stadium","shortName":"Sawai Mansingh Stadium","city":"Jaipur","country":"India"},"team1":{"team":{"id":8,"fullName":"Rajasthan Royals","shortName":"Royals","abbreviation":"RR","primaryColor":"004B8C","secondaryColor":"FFFFFF","type":"m","typeString":"m"}},"team2":{"team":{"id":9,"fullName":"Royal Challengers Bangalore","shortName":"Challengers","abbreviation":"RCB","primaryColor":"000000","secondaryColor":"FF3245","type":"m","typeString":"m"}},"groupName":""},{"matchId":{"id":7947,"name":"ipl2018-54"},"description":"Match 54","matchDate":"2018-05-19T20:00:00+0530","matchType":"IPLT20","matchState":"U","venue":{"id":10,"fullName":"Rajiv Gandhi Intl. Cricket Stadium","shortName":"Rajiv Gandhi Intl. Cricket Stadium","city":"Hyderabad","country":"India"},"team1":{"team":{"id":62,"fullName":"Sunrisers Hyderabad","shortName":"Sunrisers","abbreviation":"SRH","primaryColor":"FF9C00","secondaryColor":"FFFFFF","type":"m","typeString":"m"}},"team2":{"team":{"id":5,"fullName":"Kolkata Knight Riders","shortName":"Knight Riders","abbreviation":"KKR","primaryColor":"6F2C91","secondaryColor":"FFFFFF","type":"m","typeString":"m"}},"groupName":""},{"matchId":{"id":7948,"name":"ipl2018-55"},"description":"Match 55","matchDate":"2018-05-20T16:00:00+0530","matchType":"IPLT20","matchState":"U","venue":{"id":8,"fullName":"Feroz Shah Kotla Ground","shortName":"Feroz Shah Kotla Ground","city":"Delhi","country":"India"},"team1":{"team":{"id":3,"fullName":"Delhi Daredevils","shortName":"Daredevils","abbreviation":"DD","primaryColor":"004C93","secondaryColor":"F83430","type":"m","typeString":"m"}},"team2":{"team":{"id":6,"fullName":"Mumbai Indians","shortName":"Mumbai","abbreviation":"MI","primaryColor":"00AEEF","secondaryColor":"FFFFFF","type":"m","typeString":"m"}},"groupName":""},{"matchId":{"id":7949,"name":"ipl2018-56"},"description":"Match 56","matchDate":"2018-05-20T20:00:00+0530","matchType":"IPLT20","matchState":"U","venue":{"id":1,"fullName":"M. A. Chidambaram Stadium","shortName":"Chidambaram","city":"Chennai","country":"India"},"team1":{"team":{"id":1,"fullName":"Chennai Super Kings","shortName":"Super Kings","abbreviation":"CSK","primaryColor":"FDB913","secondaryColor":"0081E5","type":"m","typeString":"m"}},"team2":{"team":{"id":4,"fullName":"Kings XI Punjab","shortName":"Kings XI","abbreviation":"KXIP","primaryColor":"DA1F3D","secondaryColor":"FFFFFF","type":"m","typeString":"m"}},"groupName":""},{"matchId":{"id":7950,"name":"ipl2018-57"},"description":"Qualifier 1","matchDate":"2018-05-22T20:00:00+0530","matchType":"IPLT20","matchState":"U","venue":{"id":4,"fullName":"Wankhede Stadium","shortName":"Wankhede Stadium","city":"Mumbai","country":"India"},"team1":{"team":{"id":544,"fullName":"TBC","shortName":"TBC","abbreviation":"TBC","primaryColor":"FFFFFF","secondaryColor":"FFFFFF","placeholder":true}},"team2":{"team":{"id":544,"fullName":"TBC","shortName":"TBC","abbreviation":"TBC","primaryColor":"FFFFFF","secondaryColor":"FFFFFF","placeholder":true}},"groupName":"Knockouts"},{"matchId":{"id":7951,"name":"ipl2018-58"},"description":"Eliminator","matchDate":"2018-05-23T20:00:00+0530","matchType":"IPLT20","matchState":"U","venue":{"id":7,"fullName":"Maharashtra Cricket Association's International Stadium","shortName":"Maharashtra Cricket Association's International Stadium","city":"Pune","country":"India"},"team1":{"team":{"id":544,"fullName":"TBC","shortName":"TBC","abbreviation":"TBC","primaryColor":"FFFFFF","secondaryColor":"FFFFFF","placeholder":true}},"team2":{"team":{"id":544,"fullName":"TBC","shortName":"TBC","abbreviation":"TBC","primaryColor":"FFFFFF","secondaryColor":"FFFFFF","placeholder":true}},"groupName":"Knockouts"},{"matchId":{"id":7952,"name":"ipl2018-59"},"description":"Qualifier 2","matchDate":"2018-05-25T20:00:00+0530","matchType":"IPLT20","matchState":"U","venue":{"id":7,"fullName":"Maharashtra Cricket Association's International Stadium","shortName":"Maharashtra Cricket Association's International Stadium","city":"Pune","country":"India"},"team1":{"team":{"id":544,"fullName":"TBC","shortName":"TBC","abbreviation":"TBC","primaryColor":"FFFFFF","secondaryColor":"FFFFFF","placeholder":true}},"team2":{"team":{"id":544,"fullName":"TBC","shortName":"TBC","abbreviation":"TBC","primaryColor":"FFFFFF","secondaryColor":"FFFFFF","placeholder":true}},"groupName":"Knockouts"},{"matchId":{"id":7953,"name":"ipl2018-60"},"description":"Final","matchDate":"2018-05-27T20:00:00+0530","matchType":"IPLT20","matchState":"U","venue":{"id":4,"fullName":"Wankhede Stadium","shortName":"Wankhede Stadium","city":"Mumbai","country":"India"},"team1":{"team":{"id":544,"fullName":"TBC","shortName":"TBC","abbreviation":"TBC","primaryColor":"FFFFFF","secondaryColor":"FFFFFF","placeholder":true}},"team2":{"team":{"id":544,"fullName":"TBC","shortName":"TBC","abbreviation":"TBC","primaryColor":"FFFFFF","secondaryColor":"FFFFFF","placeholder":true}},"groupName":"Knockouts"}]
     */

    @SerializedName("tournamentId")
    private TournamentIdBean tournamentId;
    @SerializedName("schedule")
    private List<ScheduleBean> schedule;

    public TournamentIdBean getTournamentId() {
        return tournamentId;
    }

    public void setTournamentId(TournamentIdBean tournamentId) {
        this.tournamentId = tournamentId;
    }

    public List<ScheduleBean> getSchedule() {
        return schedule;
    }

    public void setSchedule(List<ScheduleBean> schedule) {
        this.schedule = schedule;
    }

    public static class TournamentIdBean {
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

    public static class ScheduleBean {
        /**
         * matchId : {"id":7894,"name":"ipl2018-01"}
         * description : Match 1
         * matchDate : 2018-04-07T20:00:00+0530
         * matchType : IPLT20
         * matchState : U
         * venue : {"id":4,"fullName":"Wankhede Stadium","shortName":"Wankhede Stadium","city":"Mumbai","country":"India"}
         * team1 : {"team":{"id":6,"fullName":"Mumbai Indians","shortName":"Mumbai","abbreviation":"MI","primaryColor":"00AEEF","secondaryColor":"FFFFFF","type":"m","typeString":"m"}}
         * team2 : {"team":{"id":1,"fullName":"Chennai Super Kings","shortName":"Super Kings","abbreviation":"CSK","primaryColor":"FDB913","secondaryColor":"0081E5","type":"m","typeString":"m"}}
         * groupName :
         */

        @SerializedName("matchId")
        private MatchIdBean matchId;
        @SerializedName("description")
        private String description;
        @SerializedName("matchDate")
        private String matchDate;
        @SerializedName("matchType")
        private String matchType;
        @SerializedName("matchState")
        private String matchState;
        @SerializedName("venue")
        private VenueBean venue;
        @SerializedName("team1")
        private Team1Bean team1;
        @SerializedName("team2")
        private Team2Bean team2;
        @SerializedName("groupName")
        private String groupName;

        public MatchIdBean getMatchId() {
            return matchId;
        }

        public void setMatchId(MatchIdBean matchId) {
            this.matchId = matchId;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getMatchDate() {
            return matchDate;
        }

        public void setMatchDate(String matchDate) {
            this.matchDate = matchDate;
        }

        public String getMatchType() {
            return matchType;
        }

        public void setMatchType(String matchType) {
            this.matchType = matchType;
        }

        public String getMatchState() {
            return matchState;
        }

        public void setMatchState(String matchState) {
            this.matchState = matchState;
        }

        public VenueBean getVenue() {
            return venue;
        }

        public void setVenue(VenueBean venue) {
            this.venue = venue;
        }

        public Team1Bean getTeam1() {
            return team1;
        }

        public void setTeam1(Team1Bean team1) {
            this.team1 = team1;
        }

        public Team2Bean getTeam2() {
            return team2;
        }

        public void setTeam2(Team2Bean team2) {
            this.team2 = team2;
        }

        public String getGroupName() {
            return groupName;
        }

        public void setGroupName(String groupName) {
            this.groupName = groupName;
        }

        public static class MatchIdBean {
            /**
             * id : 7894
             * name : ipl2018-01
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

        public static class VenueBean {
            /**
             * id : 4
             * fullName : Wankhede Stadium
             * shortName : Wankhede Stadium
             * city : Mumbai
             * country : India
             */

            @SerializedName("id")
            private int id;
            @SerializedName("fullName")
            private String fullName;
            @SerializedName("shortName")
            private String shortName;
            @SerializedName("city")
            private String city;
            @SerializedName("country")
            private String country;

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

            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }

            public String getCountry() {
                return country;
            }

            public void setCountry(String country) {
                this.country = country;
            }
        }

        public static class Team1Bean {
            /**
             * team : {"id":6,"fullName":"Mumbai Indians","shortName":"Mumbai","abbreviation":"MI","primaryColor":"00AEEF","secondaryColor":"FFFFFF","type":"m","typeString":"m"}
             */

            @SerializedName("team")
            private TeamBean team;

            public TeamBean getTeam() {
                return team;
            }

            public void setTeam(TeamBean team) {
                this.team = team;
            }

            public static class TeamBean {
                /**
                 * id : 6
                 * fullName : Mumbai Indians
                 * shortName : Mumbai
                 * abbreviation : MI
                 * primaryColor : 00AEEF
                 * secondaryColor : FFFFFF
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
        }

        public static class Team2Bean {
            /**
             * team : {"id":1,"fullName":"Chennai Super Kings","shortName":"Super Kings","abbreviation":"CSK","primaryColor":"FDB913","secondaryColor":"0081E5","type":"m","typeString":"m"}
             */

            @SerializedName("team")
            private TeamBeanX team;

            public TeamBeanX getTeam() {
                return team;
            }

            public void setTeam(TeamBeanX team) {
                this.team = team;
            }

            public static class TeamBeanX {
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
        }
    }
}
