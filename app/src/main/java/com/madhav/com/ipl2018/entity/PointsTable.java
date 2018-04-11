package com.madhav.com.ipl2018.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by madhav on 4/9/2018.
 */

public class PointsTable {

    /**
     * tournamentId : {"id":7749,"name":"ipl2018"}
     * groups : [{"standings":[{"positionLabel":"1","position":1,"played":1,"won":1,"lost":0,"tied":0,"noResult":0,"points":2,"bowlAvg":"13.88888888888889","netRunRate":"+1.771","team":{"id":62,"fullName":"Sunrisers Hyderabad","shortName":"Sunrisers","abbreviation":"SRH","primaryColor":"FF9C00","secondaryColor":"FFFFFF","type":"m","typeString":"m"},"recentForm":[{"outcome":"W","matchId":{"id":7897,"name":"ipl2018-04","parentId":{"id":7749,"name":"ipl2018"},"tournamentId":{"id":7749,"name":"ipl2018"}}}],"totalRunsFor":127,"totalRunsAgainst":125,"totalBallsFor":95,"totalBallsAgainst":120},{"positionLabel":"2","position":2,"played":1,"won":1,"lost":0,"tied":0,"noResult":0,"points":2,"bowlAvg":"25.142857142857142","netRunRate":"+0.598","team":{"id":5,"fullName":"Kolkata Knight Riders","shortName":"Knight Riders","abbreviation":"KKR","primaryColor":"6F2C91","secondaryColor":"FFFFFF","type":"m","typeString":"m"},"recentForm":[{"outcome":"W","matchId":{"id":7896,"name":"ipl2018-03","parentId":{"id":7749,"name":"ipl2018"},"tournamentId":{"id":7749,"name":"ipl2018"}}}],"totalRunsFor":177,"totalRunsAgainst":176,"totalBallsFor":113,"totalBallsAgainst":120},{"positionLabel":"3","position":3,"played":1,"won":1,"lost":0,"tied":0,"noResult":0,"points":2,"bowlAvg":"23.714285714285715","netRunRate":"+0.567","team":{"id":4,"fullName":"Kings XI Punjab","shortName":"Kings XI","abbreviation":"KXIP","primaryColor":"DA1F3D","secondaryColor":"FFFFFF","type":"m","typeString":"m"},"recentForm":[{"outcome":"W","matchId":{"id":7895,"name":"ipl2018-02","parentId":{"id":7749,"name":"ipl2018"},"tournamentId":{"id":7749,"name":"ipl2018"}}}],"totalRunsFor":167,"totalRunsAgainst":166,"totalBallsFor":113,"totalBallsAgainst":120},{"positionLabel":"4","position":4,"played":1,"won":1,"lost":0,"tied":0,"noResult":0,"points":2,"bowlAvg":"41.25","netRunRate":"+0.271","team":{"id":1,"fullName":"Chennai Super Kings","shortName":"Super Kings","abbreviation":"CSK","primaryColor":"FDB913","secondaryColor":"0081E5","type":"m","typeString":"m"},"recentForm":[{"outcome":"W","matchId":{"id":7894,"name":"ipl2018-01","parentId":{"id":7749,"name":"ipl2018"},"tournamentId":{"id":7749,"name":"ipl2018"}}}],"totalRunsFor":169,"totalRunsAgainst":165,"totalBallsFor":119,"totalBallsAgainst":120},{"positionLabel":"5","position":5,"played":1,"won":0,"lost":1,"tied":0,"noResult":0,"points":0,"bowlAvg":"18.77777777777778","netRunRate":"-0.271","team":{"id":6,"fullName":"Mumbai Indians","shortName":"Mumbai","abbreviation":"MI","primaryColor":"00AEEF","secondaryColor":"FFFFFF","type":"m","typeString":"m"},"recentForm":[{"outcome":"L","matchId":{"id":7894,"name":"ipl2018-01","parentId":{"id":7749,"name":"ipl2018"},"tournamentId":{"id":7749,"name":"ipl2018"}}}],"totalRunsFor":165,"totalRunsAgainst":169,"totalBallsFor":120,"totalBallsAgainst":119},{"positionLabel":"6","position":6,"played":1,"won":0,"lost":1,"tied":0,"noResult":0,"points":0,"bowlAvg":"41.75","netRunRate":"-0.567","team":{"id":3,"fullName":"Delhi Daredevils","shortName":"Daredevils","abbreviation":"DD","primaryColor":"004C93","secondaryColor":"F83430","type":"m","typeString":"m"},"recentForm":[{"outcome":"L","matchId":{"id":7895,"name":"ipl2018-02","parentId":{"id":7749,"name":"ipl2018"},"tournamentId":{"id":7749,"name":"ipl2018"}}}],"totalRunsFor":166,"totalRunsAgainst":167,"totalBallsFor":120,"totalBallsAgainst":113},{"positionLabel":"7","position":7,"played":1,"won":0,"lost":1,"tied":0,"noResult":0,"points":0,"bowlAvg":"29.5","netRunRate":"-0.598","team":{"id":9,"fullName":"Royal Challengers Bangalore","shortName":"Challengers","abbreviation":"RCB","primaryColor":"000000","secondaryColor":"FF3245","type":"m","typeString":"m"},"recentForm":[{"outcome":"L","matchId":{"id":7896,"name":"ipl2018-03","parentId":{"id":7749,"name":"ipl2018"},"tournamentId":{"id":7749,"name":"ipl2018"}}}],"totalRunsFor":176,"totalRunsAgainst":177,"totalBallsFor":120,"totalBallsAgainst":113},{"positionLabel":"8","position":8,"played":1,"won":0,"lost":1,"tied":0,"noResult":0,"points":0,"bowlAvg":"127.0","netRunRate":"-1.771","team":{"id":8,"fullName":"Rajasthan Royals","shortName":"Royals","abbreviation":"RR","primaryColor":"004B8C","secondaryColor":"FFFFFF","type":"m","typeString":"m"},"recentForm":[{"outcome":"L","matchId":{"id":7897,"name":"ipl2018-04","parentId":{"id":7749,"name":"ipl2018"},"tournamentId":{"id":7749,"name":"ipl2018"}}}],"totalRunsFor":125,"totalRunsAgainst":127,"totalBallsFor":120,"totalBallsAgainst":95}]},{"groupName":"Knockouts","standings":[{"positionLabel":"1","position":1,"played":0,"won":0,"lost":0,"tied":0,"noResult":0,"points":0,"bowlAvg":"Infinity","netRunRate":"+0.000","team":{"id":544,"fullName":"TBC","shortName":"TBC","abbreviation":"TBC","primaryColor":"FFFFFF","secondaryColor":"FFFFFF","placeholder":true},"recentForm":[]}]}]
     */

    @SerializedName("tournamentId")
    private TournamentId tournamentId;
    @SerializedName("groups")
    private List<Groups> groups;

    public TournamentId getTournamentId() {
        return tournamentId;
    }

    public void setTournamentId(TournamentId tournamentId) {
        this.tournamentId = tournamentId;
    }

    public List<Groups> getGroups() {
        return groups;
    }

    public void setGroups(List<Groups> groups) {
        this.groups = groups;
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

    public static class Groups {
        /**
         * standings : [{"positionLabel":"1","position":1,"played":1,"won":1,"lost":0,"tied":0,"noResult":0,"points":2,"bowlAvg":"13.88888888888889","netRunRate":"+1.771","team":{"id":62,"fullName":"Sunrisers Hyderabad","shortName":"Sunrisers","abbreviation":"SRH","primaryColor":"FF9C00","secondaryColor":"FFFFFF","type":"m","typeString":"m"},"recentForm":[{"outcome":"W","matchId":{"id":7897,"name":"ipl2018-04","parentId":{"id":7749,"name":"ipl2018"},"tournamentId":{"id":7749,"name":"ipl2018"}}}],"totalRunsFor":127,"totalRunsAgainst":125,"totalBallsFor":95,"totalBallsAgainst":120},{"positionLabel":"2","position":2,"played":1,"won":1,"lost":0,"tied":0,"noResult":0,"points":2,"bowlAvg":"25.142857142857142","netRunRate":"+0.598","team":{"id":5,"fullName":"Kolkata Knight Riders","shortName":"Knight Riders","abbreviation":"KKR","primaryColor":"6F2C91","secondaryColor":"FFFFFF","type":"m","typeString":"m"},"recentForm":[{"outcome":"W","matchId":{"id":7896,"name":"ipl2018-03","parentId":{"id":7749,"name":"ipl2018"},"tournamentId":{"id":7749,"name":"ipl2018"}}}],"totalRunsFor":177,"totalRunsAgainst":176,"totalBallsFor":113,"totalBallsAgainst":120},{"positionLabel":"3","position":3,"played":1,"won":1,"lost":0,"tied":0,"noResult":0,"points":2,"bowlAvg":"23.714285714285715","netRunRate":"+0.567","team":{"id":4,"fullName":"Kings XI Punjab","shortName":"Kings XI","abbreviation":"KXIP","primaryColor":"DA1F3D","secondaryColor":"FFFFFF","type":"m","typeString":"m"},"recentForm":[{"outcome":"W","matchId":{"id":7895,"name":"ipl2018-02","parentId":{"id":7749,"name":"ipl2018"},"tournamentId":{"id":7749,"name":"ipl2018"}}}],"totalRunsFor":167,"totalRunsAgainst":166,"totalBallsFor":113,"totalBallsAgainst":120},{"positionLabel":"4","position":4,"played":1,"won":1,"lost":0,"tied":0,"noResult":0,"points":2,"bowlAvg":"41.25","netRunRate":"+0.271","team":{"id":1,"fullName":"Chennai Super Kings","shortName":"Super Kings","abbreviation":"CSK","primaryColor":"FDB913","secondaryColor":"0081E5","type":"m","typeString":"m"},"recentForm":[{"outcome":"W","matchId":{"id":7894,"name":"ipl2018-01","parentId":{"id":7749,"name":"ipl2018"},"tournamentId":{"id":7749,"name":"ipl2018"}}}],"totalRunsFor":169,"totalRunsAgainst":165,"totalBallsFor":119,"totalBallsAgainst":120},{"positionLabel":"5","position":5,"played":1,"won":0,"lost":1,"tied":0,"noResult":0,"points":0,"bowlAvg":"18.77777777777778","netRunRate":"-0.271","team":{"id":6,"fullName":"Mumbai Indians","shortName":"Mumbai","abbreviation":"MI","primaryColor":"00AEEF","secondaryColor":"FFFFFF","type":"m","typeString":"m"},"recentForm":[{"outcome":"L","matchId":{"id":7894,"name":"ipl2018-01","parentId":{"id":7749,"name":"ipl2018"},"tournamentId":{"id":7749,"name":"ipl2018"}}}],"totalRunsFor":165,"totalRunsAgainst":169,"totalBallsFor":120,"totalBallsAgainst":119},{"positionLabel":"6","position":6,"played":1,"won":0,"lost":1,"tied":0,"noResult":0,"points":0,"bowlAvg":"41.75","netRunRate":"-0.567","team":{"id":3,"fullName":"Delhi Daredevils","shortName":"Daredevils","abbreviation":"DD","primaryColor":"004C93","secondaryColor":"F83430","type":"m","typeString":"m"},"recentForm":[{"outcome":"L","matchId":{"id":7895,"name":"ipl2018-02","parentId":{"id":7749,"name":"ipl2018"},"tournamentId":{"id":7749,"name":"ipl2018"}}}],"totalRunsFor":166,"totalRunsAgainst":167,"totalBallsFor":120,"totalBallsAgainst":113},{"positionLabel":"7","position":7,"played":1,"won":0,"lost":1,"tied":0,"noResult":0,"points":0,"bowlAvg":"29.5","netRunRate":"-0.598","team":{"id":9,"fullName":"Royal Challengers Bangalore","shortName":"Challengers","abbreviation":"RCB","primaryColor":"000000","secondaryColor":"FF3245","type":"m","typeString":"m"},"recentForm":[{"outcome":"L","matchId":{"id":7896,"name":"ipl2018-03","parentId":{"id":7749,"name":"ipl2018"},"tournamentId":{"id":7749,"name":"ipl2018"}}}],"totalRunsFor":176,"totalRunsAgainst":177,"totalBallsFor":120,"totalBallsAgainst":113},{"positionLabel":"8","position":8,"played":1,"won":0,"lost":1,"tied":0,"noResult":0,"points":0,"bowlAvg":"127.0","netRunRate":"-1.771","team":{"id":8,"fullName":"Rajasthan Royals","shortName":"Royals","abbreviation":"RR","primaryColor":"004B8C","secondaryColor":"FFFFFF","type":"m","typeString":"m"},"recentForm":[{"outcome":"L","matchId":{"id":7897,"name":"ipl2018-04","parentId":{"id":7749,"name":"ipl2018"},"tournamentId":{"id":7749,"name":"ipl2018"}}}],"totalRunsFor":125,"totalRunsAgainst":127,"totalBallsFor":120,"totalBallsAgainst":95}]
         * groupName : Knockouts
         */

        @SerializedName("groupName")
        private String groupName;
        @SerializedName("standings")
        private List<Standings> standings;

        public String getGroupName() {
            return groupName;
        }

        public void setGroupName(String groupName) {
            this.groupName = groupName;
        }

        public List<Standings> getStandings() {
            return standings;
        }

        public void setStandings(List<Standings> standings) {
            this.standings = standings;
        }

        public static class Standings {
            /**
             * positionLabel : 1
             * position : 1
             * played : 1
             * won : 1
             * lost : 0
             * tied : 0
             * noResult : 0
             * points : 2
             * bowlAvg : 13.88888888888889
             * netRunRate : +1.771
             * team : {"id":62,"fullName":"Sunrisers Hyderabad","shortName":"Sunrisers","abbreviation":"SRH","primaryColor":"FF9C00","secondaryColor":"FFFFFF","type":"m","typeString":"m"}
             * recentForm : [{"outcome":"W","matchId":{"id":7897,"name":"ipl2018-04","parentId":{"id":7749,"name":"ipl2018"},"tournamentId":{"id":7749,"name":"ipl2018"}}}]
             * totalRunsFor : 127
             * totalRunsAgainst : 125
             * totalBallsFor : 95
             * totalBallsAgainst : 120
             */

            @SerializedName("positionLabel")
            private String positionLabel;
            @SerializedName("position")
            private int position;
            @SerializedName("played")
            private int played;
            @SerializedName("won")
            private int won;
            @SerializedName("lost")
            private int lost;
            @SerializedName("tied")
            private int tied;
            @SerializedName("noResult")
            private int noResult;
            @SerializedName("points")
            private int points;
            @SerializedName("bowlAvg")
            private String bowlAvg;
            @SerializedName("netRunRate")
            private String netRunRate;
            @SerializedName("team")
            private Team team;
            @SerializedName("totalRunsFor")
            private int totalRunsFor;
            @SerializedName("totalRunsAgainst")
            private int totalRunsAgainst;
            @SerializedName("totalBallsFor")
            private int totalBallsFor;
            @SerializedName("totalBallsAgainst")
            private int totalBallsAgainst;
            @SerializedName("recentForm")
            private List<RecentForm> recentForm;

            public String getPositionLabel() {
                return positionLabel;
            }

            public void setPositionLabel(String positionLabel) {
                this.positionLabel = positionLabel;
            }

            public int getPosition() {
                return position;
            }

            public void setPosition(int position) {
                this.position = position;
            }

            public int getPlayed() {
                return played;
            }

            public void setPlayed(int played) {
                this.played = played;
            }

            public int getWon() {
                return won;
            }

            public void setWon(int won) {
                this.won = won;
            }

            public int getLost() {
                return lost;
            }

            public void setLost(int lost) {
                this.lost = lost;
            }

            public int getTied() {
                return tied;
            }

            public void setTied(int tied) {
                this.tied = tied;
            }

            public int getNoResult() {
                return noResult;
            }

            public void setNoResult(int noResult) {
                this.noResult = noResult;
            }

            public int getPoints() {
                return points;
            }

            public void setPoints(int points) {
                this.points = points;
            }

            public String getBowlAvg() {
                return bowlAvg;
            }

            public void setBowlAvg(String bowlAvg) {
                this.bowlAvg = bowlAvg;
            }

            public String getNetRunRate() {
                return netRunRate;
            }

            public void setNetRunRate(String netRunRate) {
                this.netRunRate = netRunRate;
            }

            public Team getTeam() {
                return team;
            }

            public void setTeam(Team team) {
                this.team = team;
            }

            public int getTotalRunsFor() {
                return totalRunsFor;
            }

            public void setTotalRunsFor(int totalRunsFor) {
                this.totalRunsFor = totalRunsFor;
            }

            public int getTotalRunsAgainst() {
                return totalRunsAgainst;
            }

            public void setTotalRunsAgainst(int totalRunsAgainst) {
                this.totalRunsAgainst = totalRunsAgainst;
            }

            public int getTotalBallsFor() {
                return totalBallsFor;
            }

            public void setTotalBallsFor(int totalBallsFor) {
                this.totalBallsFor = totalBallsFor;
            }

            public int getTotalBallsAgainst() {
                return totalBallsAgainst;
            }

            public void setTotalBallsAgainst(int totalBallsAgainst) {
                this.totalBallsAgainst = totalBallsAgainst;
            }

            public List<RecentForm> getRecentForm() {
                return recentForm;
            }

            public void setRecentForm(List<RecentForm> recentForm) {
                this.recentForm = recentForm;
            }

            public static class Team {
                /**
                 * id : 62
                 * fullName : Sunrisers Hyderabad
                 * shortName : Sunrisers
                 * abbreviation : SRH
                 * primaryColor : FF9C00
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

            public static class RecentForm {
                /**
                 * outcome : W
                 * matchId : {"id":7897,"name":"ipl2018-04","parentId":{"id":7749,"name":"ipl2018"},"tournamentId":{"id":7749,"name":"ipl2018"}}
                 */

                @SerializedName("outcome")
                private String outcome;
                @SerializedName("matchId")
                private MatchId matchId;

                public String getOutcome() {
                    return outcome;
                }

                public void setOutcome(String outcome) {
                    this.outcome = outcome;
                }

                public MatchId getMatchId() {
                    return matchId;
                }

                public void setMatchId(MatchId matchId) {
                    this.matchId = matchId;
                }

                public static class MatchId {
                    /**
                     * id : 7897
                     * name : ipl2018-04
                     * parentId : {"id":7749,"name":"ipl2018"}
                     * tournamentId : {"id":7749,"name":"ipl2018"}
                     */

                    @SerializedName("id")
                    private int id;
                    @SerializedName("name")
                    private String name;
                    @SerializedName("parentId")
                    private ParentId parentId;
                    @SerializedName("tournamentId")
                    private TournamentIdX tournamentId;

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

                    public ParentId getParentId() {
                        return parentId;
                    }

                    public void setParentId(ParentId parentId) {
                        this.parentId = parentId;
                    }

                    public TournamentIdX getTournamentId() {
                        return tournamentId;
                    }

                    public void setTournamentId(TournamentIdX tournamentId) {
                        this.tournamentId = tournamentId;
                    }

                    public static class ParentId {
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

                    public static class TournamentIdX {
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
                }
            }
        }
    }
}
