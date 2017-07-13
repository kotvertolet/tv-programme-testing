package com.github.kotvertolet.tvprogrammetesting.pojo.channelProgramme;

import com.github.kotvertolet.tvprogrammetesting.utils.xml.LocalDateTimeXmlAdapter;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "channel",
        "programme"
})
@XmlRootElement(name = "tv")
public class WeeklyChannelProgramme {

    @XmlElement(required = true)
    private WeeklyChannelProgramme.Channel channel;
    private List<WeeklyChannelProgramme.Programme> programme;
    @XmlAttribute(name = "source-info-url")
    @XmlSchemaType(name = "anyURI")
    private String sourceInfoUrl;
    @XmlAttribute(name = "source-info-name")
    private String sourceInfoName;
    @XmlAttribute(name = "generator-info-url")
    @XmlSchemaType(name = "anyURI")
    private String generatorInfoUrl;

    public WeeklyChannelProgramme.Channel getChannel() {
        return channel;
    }

    public List<WeeklyChannelProgramme.Programme> getProgramme() {
        if (programme == null) {
            programme = new ArrayList<WeeklyChannelProgramme.Programme>();
        }
        return this.programme;
    }

    public String getSourceInfoUrl() {
        return sourceInfoUrl;
    }

    public String getSourceInfoName() {
        return sourceInfoName;
    }

    public String getGeneratorInfoUrl() {
        return generatorInfoUrl;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "displayName"
    })
    public static class Channel {

        @XmlElement(name = "display-name", required = true)
        String displayName;
        @XmlAttribute(name = "id")
        Integer id;

        public String getDisplayName() {
            return displayName;
        }

        public Integer getId() {
            return id;
        }

    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "id",
            "date",
            "title",
            "category",
            "genre",
            "desc",
            "longdesc",
            "seasonNum",
            "episodeNum",
            "productionYear",
            "image",
            "megogoId",
            "kinopoiskId",
            "parental"
    })

    public static class Programme {

        long id;
        @XmlElement(required = true)
        @XmlSchemaType(name = "date")
        XMLGregorianCalendar date;
        @XmlElement(required = true)
        WeeklyChannelProgramme.Programme.Title title;
        @XmlElement(required = true)
        WeeklyChannelProgramme.Programme.Category category;
        WeeklyChannelProgramme.Programme.Genre genre;
        WeeklyChannelProgramme.Programme.Desc desc;
        WeeklyChannelProgramme.Programme.Longdesc longdesc;
        @XmlElement(name = "season-num")
        Integer seasonNum;
        @XmlElement(name = "episode-num")
        String episodeNum;
        @XmlElement(name = "production_year")
        String productionYear;
        @XmlSchemaType(name = "anyURI")
        String image;
        @XmlElement(name = "megogo_id")
        Integer megogoId;
        @XmlElement(name = "kinopoisk_id")
        Integer kinopoiskId;
        String parental;
        @XmlAttribute(name = "start")
        @XmlJavaTypeAdapter(type = LocalDateTime.class, value = LocalDateTimeXmlAdapter.class)
        LocalDateTime start;
        @XmlJavaTypeAdapter(type = LocalDateTime.class, value = LocalDateTimeXmlAdapter.class)
        @XmlAttribute(name = "stop")
        LocalDateTime stop;
        @XmlAttribute(name = "channel")
        Integer channel;
        @XmlAttribute(name = "genre_id")
        Integer genreId;
        @XmlAttribute(name = "programme_id")
        Integer programmeId;
        @XmlAttribute(name = "category_id")
        Integer categoryId;

        public long getId() {
            return id;
        }

        public XMLGregorianCalendar getDate() {
            return date;
        }

        public WeeklyChannelProgramme.Programme.Title getTitle() {
            return title;
        }

        public WeeklyChannelProgramme.Programme.Category getCategory() {
            return category;
        }

        public WeeklyChannelProgramme.Programme.Genre getGenre() {
            return genre;
        }

        public WeeklyChannelProgramme.Programme.Desc getDesc() {
            return desc;
        }

        public WeeklyChannelProgramme.Programme.Longdesc getLongdesc() {
            return longdesc;
        }

        public Integer getSeasonNum() {
            return seasonNum;
        }

        public String getEpisodeNum() {
            return episodeNum;
        }

        public String getProductionYear() {
            return productionYear;
        }

        public String getImage() {
            return image;
        }

        public Integer getMegogoId() {
            return megogoId;
        }

        public Integer getKinopoiskId() {
            return kinopoiskId;
        }

        public String getParental() {
            return parental;
        }

        public LocalDateTime getStart() {
            return start;
        }

        public LocalDateTime getStop() {
            return stop;
        }

        public Integer getChannel() {
            return channel;
        }

        public Integer getGenreId() {
            return genreId;
        }

        public Integer getProgrammeId() {
            return programmeId;
        }

        public Integer getCategoryId() {
            return categoryId;
        }

        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "value"
        })
        public static class Category {

            @XmlValue
            String value;
            @XmlAttribute(name = "lang")
            String lang;

            public String getValue() {
                return value;
            }

            public String getLang() {
                return lang;
            }

            @Override
            public String toString() {
                return "Category{" +
                        "value='" + value + '\'' +
                        ", lang='" + lang + '\'' +
                        '}';
            }
        }

        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "value"
        })
        public static class Desc {

            @XmlValue
            String value;
            @XmlAttribute(name = "lang")
            String lang;

            public String getValue() {
                return value;
            }

            public String getLang() {
                return lang;
            }

            @Override
            public String toString() {
                return "Desc{" +
                        "value='" + value + '\'' +
                        ", lang='" + lang + '\'' +
                        '}';
            }
        }

        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "value"
        })
        public static class Genre {

            @XmlValue
            String value;
            @XmlAttribute(name = "lang")
            String lang;

            public String getValue() {
                return value;
            }

            public String getLang() {
                return lang;
            }

            @Override
            public String toString() {
                return "Genre{" +
                        "value='" + value + '\'' +
                        ", lang='" + lang + '\'' +
                        '}';
            }
        }

        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "value"
        })
        public static class Longdesc {

            @XmlValue
            String value;
            @XmlAttribute(name = "lang")
            String lang;

            public String getValue() {
                return value;
            }

            public String getLang() {
                return lang;
            }

            @Override
            public String toString() {
                return "Longdesc{" +
                        "value='" + value + '\'' +
                        ", lang='" + lang + '\'' +
                        '}';
            }
        }

        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "value"
        })
        public static class Title {

            @XmlValue
            String value;
            @XmlAttribute(name = "lang")
            String lang;

            public String getValue() {
                return value;
            }

            public String getLang() {
                return lang;
            }

            @Override
            public String toString() {
                return "Title{" +
                        "value='" + value + '\'' +
                        ", lang='" + lang + '\'' +
                        '}';
            }
        }

        @Override
        public String toString() {
            return "Programme{" +
                    "id=" + id +
                    ", date=" + date +
                    ", title=" + title +
                    ", category=" + category +
                    ", genre=" + genre +
                    ", desc=" + desc +
                    ", longdesc=" + longdesc +
                    ", seasonNum=" + seasonNum +
                    ", episodeNum='" + episodeNum + '\'' +
                    ", productionYear='" + productionYear + '\'' +
                    ", image='" + image + '\'' +
                    ", megogoId=" + megogoId +
                    ", kinopoiskId=" + kinopoiskId +
                    ", parental='" + parental + '\'' +
                    ", start=" + start +
                    ", stop=" + stop +
                    ", channel=" + channel +
                    ", genreId=" + genreId +
                    ", programmeId=" + programmeId +
                    ", categoryId=" + categoryId +
                    '}';
        }
    }
}