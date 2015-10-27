package com.cloudplatform.module.version.model;

import com.cloudplatform.core.model.BaseModelID;

import javax.persistence.*;


@Entity
@Table(name = "LATEST_VERSION")
@NamedQueries(
        @NamedQuery(name = "LATEST_VERSION_LAST", query = "select v from Version v order by v.major, v.minor, v.patch desc")
)
public class Version extends BaseModelID<Integer> {

    private static final long serialVersionUID = -2573763017488910282L;
    public static final String QUERY_LATEST_VERSION_LAST = "LATEST_VERSION_LAST";

    private Integer major;
    private Integer minor;
    private Integer patch;
    private String tag;

    @Column(name = "VERSION_MAJOR")
    public Integer getMajor() {
        return major;
    }

    public void setMajor(Integer major) {
        this.major = major;
    }

    @Column(name = "VERSION_MINOR")
    public Integer getMinor() {
        return minor;
    }

    public void setMinor(Integer minor) {
        this.minor = minor;
    }

    @Column(name = "VERSION_PATCH")
    public Integer getPatch() {
        return patch;
    }

    public void setPatch(Integer patch) {
        this.patch = patch;
    }

    @Column(name = "VERSION_TAG", length = 100)
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}
