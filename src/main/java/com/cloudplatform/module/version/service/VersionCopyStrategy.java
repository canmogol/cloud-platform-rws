package com.cloudplatform.module.version.service;

import com.cloudplatform.app.serviceengine.dto.LatestVersion;
import com.cloudplatform.module.version.model.Version;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

@Stateless(name = "VersionCopyStrategy", mappedName = "VersionCopyStrategy")
@LocalBean
public class VersionCopyStrategy {

    public void copy(LatestVersion dto, Version entity) {
        dto.setMajor(entity.getMajor());
        dto.setMinor(entity.getMinor());
        dto.setPatch(entity.getPatch());
        dto.setTag(entity.getTag());
    }

}
