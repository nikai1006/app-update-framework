package org.wiztools.appupdate;

/**
 *
 * @author subwiz
 */
public interface VersionUrl {
    Version getVersion();
    String getUrl();
    String getReleaseNotesUrl();
    Version getLeastVersionRequired();
}
