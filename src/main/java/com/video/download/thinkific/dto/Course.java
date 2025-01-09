package com.video.download.thinkific.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@AllArgsConstructor
@NoArgsConstructor
public class Course {
    public int id;
    public String name;
    public String slug;
    public String landing_page_url;
    public String checkout_page_url;
    public String site_twitter_handle;
    public String support_email;
    public String subdomain;
    public boolean use_linkedin_profile_certification;
    public String completion_page_html;
    public boolean use_custom_completion_page_html;
    public boolean reviews_enabled;
    public boolean goals_enabled;
    public boolean autoplay_all_videos;
    public boolean require_video_completion;
    public String video_completion_percentage;
    public boolean disable_chapter_completed_modal;
    public Object theme;
    public Object primary_color;
    public Object font;
    public Object logo;
    public boolean show_logo;
    public boolean disable_text_selection;
    public boolean hide_lesson_type_label_and_icon;
    public boolean hide_lesson_type_icon;
    public boolean is_onboarding_demo_course;
    public boolean social_share_course_completion_overridden;
    public boolean social_share_chapter_completion_overridden;
    public Object social_share_message;
    public String facebook_shared_landing_page_url;
    public String linkedin_shared_landing_page_url;
    public String twitter_shared_landing_page_url;
    public String shared_landing_page_url;
    public ArrayList<Integer> chapter_ids;
    public int product_id;

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getSlug() {
        return this.slug;
    }

    public String getLanding_page_url() {
        return this.landing_page_url;
    }

    public String getCheckout_page_url() {
        return this.checkout_page_url;
    }

    public String getSite_twitter_handle() {
        return this.site_twitter_handle;
    }

    public String getSupport_email() {
        return this.support_email;
    }

    public String getSubdomain() {
        return this.subdomain;
    }

    public boolean isUse_linkedin_profile_certification() {
        return this.use_linkedin_profile_certification;
    }

    public String getCompletion_page_html() {
        return this.completion_page_html;
    }

    public boolean isUse_custom_completion_page_html() {
        return this.use_custom_completion_page_html;
    }

    public boolean isReviews_enabled() {
        return this.reviews_enabled;
    }

    public boolean isGoals_enabled() {
        return this.goals_enabled;
    }

    public boolean isAutoplay_all_videos() {
        return this.autoplay_all_videos;
    }

    public boolean isRequire_video_completion() {
        return this.require_video_completion;
    }

    public String getVideo_completion_percentage() {
        return this.video_completion_percentage;
    }

    public boolean isDisable_chapter_completed_modal() {
        return this.disable_chapter_completed_modal;
    }

    public Object getTheme() {
        return this.theme;
    }

    public Object getPrimary_color() {
        return this.primary_color;
    }

    public Object getFont() {
        return this.font;
    }

    public Object getLogo() {
        return this.logo;
    }

    public boolean isShow_logo() {
        return this.show_logo;
    }

    public boolean isDisable_text_selection() {
        return this.disable_text_selection;
    }

    public boolean isHide_lesson_type_label_and_icon() {
        return this.hide_lesson_type_label_and_icon;
    }

    public boolean isHide_lesson_type_icon() {
        return this.hide_lesson_type_icon;
    }

    public boolean is_onboarding_demo_course() {
        return this.is_onboarding_demo_course;
    }

    public boolean isSocial_share_course_completion_overridden() {
        return this.social_share_course_completion_overridden;
    }

    public boolean isSocial_share_chapter_completion_overridden() {
        return this.social_share_chapter_completion_overridden;
    }

    public Object getSocial_share_message() {
        return this.social_share_message;
    }

    public String getFacebook_shared_landing_page_url() {
        return this.facebook_shared_landing_page_url;
    }

    public String getLinkedin_shared_landing_page_url() {
        return this.linkedin_shared_landing_page_url;
    }

    public String getTwitter_shared_landing_page_url() {
        return this.twitter_shared_landing_page_url;
    }

    public String getShared_landing_page_url() {
        return this.shared_landing_page_url;
    }

    public ArrayList<Integer> getChapter_ids() {
        return this.chapter_ids;
    }

    public int getProduct_id() {
        return this.product_id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public void setLanding_page_url(String landing_page_url) {
        this.landing_page_url = landing_page_url;
    }

    public void setCheckout_page_url(String checkout_page_url) {
        this.checkout_page_url = checkout_page_url;
    }

    public void setSite_twitter_handle(String site_twitter_handle) {
        this.site_twitter_handle = site_twitter_handle;
    }

    public void setSupport_email(String support_email) {
        this.support_email = support_email;
    }

    public void setSubdomain(String subdomain) {
        this.subdomain = subdomain;
    }

    public void setUse_linkedin_profile_certification(boolean use_linkedin_profile_certification) {
        this.use_linkedin_profile_certification = use_linkedin_profile_certification;
    }

    public void setCompletion_page_html(String completion_page_html) {
        this.completion_page_html = completion_page_html;
    }

    public void setUse_custom_completion_page_html(boolean use_custom_completion_page_html) {
        this.use_custom_completion_page_html = use_custom_completion_page_html;
    }

    public void setReviews_enabled(boolean reviews_enabled) {
        this.reviews_enabled = reviews_enabled;
    }

    public void setGoals_enabled(boolean goals_enabled) {
        this.goals_enabled = goals_enabled;
    }

    public void setAutoplay_all_videos(boolean autoplay_all_videos) {
        this.autoplay_all_videos = autoplay_all_videos;
    }

    public void setRequire_video_completion(boolean require_video_completion) {
        this.require_video_completion = require_video_completion;
    }

    public void setVideo_completion_percentage(String video_completion_percentage) {
        this.video_completion_percentage = video_completion_percentage;
    }

    public void setDisable_chapter_completed_modal(boolean disable_chapter_completed_modal) {
        this.disable_chapter_completed_modal = disable_chapter_completed_modal;
    }

    public void setTheme(Object theme) {
        this.theme = theme;
    }

    public void setPrimary_color(Object primary_color) {
        this.primary_color = primary_color;
    }

    public void setFont(Object font) {
        this.font = font;
    }

    public void setLogo(Object logo) {
        this.logo = logo;
    }

    public void setShow_logo(boolean show_logo) {
        this.show_logo = show_logo;
    }

    public void setDisable_text_selection(boolean disable_text_selection) {
        this.disable_text_selection = disable_text_selection;
    }

    public void setHide_lesson_type_label_and_icon(boolean hide_lesson_type_label_and_icon) {
        this.hide_lesson_type_label_and_icon = hide_lesson_type_label_and_icon;
    }

    public void setHide_lesson_type_icon(boolean hide_lesson_type_icon) {
        this.hide_lesson_type_icon = hide_lesson_type_icon;
    }

    public void set_onboarding_demo_course(boolean is_onboarding_demo_course) {
        this.is_onboarding_demo_course = is_onboarding_demo_course;
    }

    public void setSocial_share_course_completion_overridden(boolean social_share_course_completion_overridden) {
        this.social_share_course_completion_overridden = social_share_course_completion_overridden;
    }

    public void setSocial_share_chapter_completion_overridden(boolean social_share_chapter_completion_overridden) {
        this.social_share_chapter_completion_overridden = social_share_chapter_completion_overridden;
    }

    public void setSocial_share_message(Object social_share_message) {
        this.social_share_message = social_share_message;
    }

    public void setFacebook_shared_landing_page_url(String facebook_shared_landing_page_url) {
        this.facebook_shared_landing_page_url = facebook_shared_landing_page_url;
    }

    public void setLinkedin_shared_landing_page_url(String linkedin_shared_landing_page_url) {
        this.linkedin_shared_landing_page_url = linkedin_shared_landing_page_url;
    }

    public void setTwitter_shared_landing_page_url(String twitter_shared_landing_page_url) {
        this.twitter_shared_landing_page_url = twitter_shared_landing_page_url;
    }

    public void setShared_landing_page_url(String shared_landing_page_url) {
        this.shared_landing_page_url = shared_landing_page_url;
    }

    public void setChapter_ids(ArrayList<Integer> chapter_ids) {
        this.chapter_ids = chapter_ids;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Course)) return false;
        final Course other = (Course) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.getId() != other.getId()) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        final Object this$slug = this.getSlug();
        final Object other$slug = other.getSlug();
        if (this$slug == null ? other$slug != null : !this$slug.equals(other$slug)) return false;
        final Object this$landing_page_url = this.getLanding_page_url();
        final Object other$landing_page_url = other.getLanding_page_url();
        if (this$landing_page_url == null ? other$landing_page_url != null : !this$landing_page_url.equals(other$landing_page_url))
            return false;
        final Object this$checkout_page_url = this.getCheckout_page_url();
        final Object other$checkout_page_url = other.getCheckout_page_url();
        if (this$checkout_page_url == null ? other$checkout_page_url != null : !this$checkout_page_url.equals(other$checkout_page_url))
            return false;
        final Object this$site_twitter_handle = this.getSite_twitter_handle();
        final Object other$site_twitter_handle = other.getSite_twitter_handle();
        if (this$site_twitter_handle == null ? other$site_twitter_handle != null : !this$site_twitter_handle.equals(other$site_twitter_handle))
            return false;
        final Object this$support_email = this.getSupport_email();
        final Object other$support_email = other.getSupport_email();
        if (this$support_email == null ? other$support_email != null : !this$support_email.equals(other$support_email))
            return false;
        final Object this$subdomain = this.getSubdomain();
        final Object other$subdomain = other.getSubdomain();
        if (this$subdomain == null ? other$subdomain != null : !this$subdomain.equals(other$subdomain)) return false;
        if (this.isUse_linkedin_profile_certification() != other.isUse_linkedin_profile_certification()) return false;
        final Object this$completion_page_html = this.getCompletion_page_html();
        final Object other$completion_page_html = other.getCompletion_page_html();
        if (this$completion_page_html == null ? other$completion_page_html != null : !this$completion_page_html.equals(other$completion_page_html))
            return false;
        if (this.isUse_custom_completion_page_html() != other.isUse_custom_completion_page_html()) return false;
        if (this.isReviews_enabled() != other.isReviews_enabled()) return false;
        if (this.isGoals_enabled() != other.isGoals_enabled()) return false;
        if (this.isAutoplay_all_videos() != other.isAutoplay_all_videos()) return false;
        if (this.isRequire_video_completion() != other.isRequire_video_completion()) return false;
        final Object this$video_completion_percentage = this.getVideo_completion_percentage();
        final Object other$video_completion_percentage = other.getVideo_completion_percentage();
        if (this$video_completion_percentage == null ? other$video_completion_percentage != null : !this$video_completion_percentage.equals(other$video_completion_percentage))
            return false;
        if (this.isDisable_chapter_completed_modal() != other.isDisable_chapter_completed_modal()) return false;
        final Object this$theme = this.getTheme();
        final Object other$theme = other.getTheme();
        if (this$theme == null ? other$theme != null : !this$theme.equals(other$theme)) return false;
        final Object this$primary_color = this.getPrimary_color();
        final Object other$primary_color = other.getPrimary_color();
        if (this$primary_color == null ? other$primary_color != null : !this$primary_color.equals(other$primary_color))
            return false;
        final Object this$font = this.getFont();
        final Object other$font = other.getFont();
        if (this$font == null ? other$font != null : !this$font.equals(other$font)) return false;
        final Object this$logo = this.getLogo();
        final Object other$logo = other.getLogo();
        if (this$logo == null ? other$logo != null : !this$logo.equals(other$logo)) return false;
        if (this.isShow_logo() != other.isShow_logo()) return false;
        if (this.isDisable_text_selection() != other.isDisable_text_selection()) return false;
        if (this.isHide_lesson_type_label_and_icon() != other.isHide_lesson_type_label_and_icon()) return false;
        if (this.isHide_lesson_type_icon() != other.isHide_lesson_type_icon()) return false;
        if (this.is_onboarding_demo_course() != other.is_onboarding_demo_course()) return false;
        if (this.isSocial_share_course_completion_overridden() != other.isSocial_share_course_completion_overridden())
            return false;
        if (this.isSocial_share_chapter_completion_overridden() != other.isSocial_share_chapter_completion_overridden())
            return false;
        final Object this$social_share_message = this.getSocial_share_message();
        final Object other$social_share_message = other.getSocial_share_message();
        if (this$social_share_message == null ? other$social_share_message != null : !this$social_share_message.equals(other$social_share_message))
            return false;
        final Object this$facebook_shared_landing_page_url = this.getFacebook_shared_landing_page_url();
        final Object other$facebook_shared_landing_page_url = other.getFacebook_shared_landing_page_url();
        if (this$facebook_shared_landing_page_url == null ? other$facebook_shared_landing_page_url != null : !this$facebook_shared_landing_page_url.equals(other$facebook_shared_landing_page_url))
            return false;
        final Object this$linkedin_shared_landing_page_url = this.getLinkedin_shared_landing_page_url();
        final Object other$linkedin_shared_landing_page_url = other.getLinkedin_shared_landing_page_url();
        if (this$linkedin_shared_landing_page_url == null ? other$linkedin_shared_landing_page_url != null : !this$linkedin_shared_landing_page_url.equals(other$linkedin_shared_landing_page_url))
            return false;
        final Object this$twitter_shared_landing_page_url = this.getTwitter_shared_landing_page_url();
        final Object other$twitter_shared_landing_page_url = other.getTwitter_shared_landing_page_url();
        if (this$twitter_shared_landing_page_url == null ? other$twitter_shared_landing_page_url != null : !this$twitter_shared_landing_page_url.equals(other$twitter_shared_landing_page_url))
            return false;
        final Object this$shared_landing_page_url = this.getShared_landing_page_url();
        final Object other$shared_landing_page_url = other.getShared_landing_page_url();
        if (this$shared_landing_page_url == null ? other$shared_landing_page_url != null : !this$shared_landing_page_url.equals(other$shared_landing_page_url))
            return false;
        final Object this$chapter_ids = this.getChapter_ids();
        final Object other$chapter_ids = other.getChapter_ids();
        if (this$chapter_ids == null ? other$chapter_ids != null : !this$chapter_ids.equals(other$chapter_ids))
            return false;
        if (this.getProduct_id() != other.getProduct_id()) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Course;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + this.getId();
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        final Object $slug = this.getSlug();
        result = result * PRIME + ($slug == null ? 43 : $slug.hashCode());
        final Object $landing_page_url = this.getLanding_page_url();
        result = result * PRIME + ($landing_page_url == null ? 43 : $landing_page_url.hashCode());
        final Object $checkout_page_url = this.getCheckout_page_url();
        result = result * PRIME + ($checkout_page_url == null ? 43 : $checkout_page_url.hashCode());
        final Object $site_twitter_handle = this.getSite_twitter_handle();
        result = result * PRIME + ($site_twitter_handle == null ? 43 : $site_twitter_handle.hashCode());
        final Object $support_email = this.getSupport_email();
        result = result * PRIME + ($support_email == null ? 43 : $support_email.hashCode());
        final Object $subdomain = this.getSubdomain();
        result = result * PRIME + ($subdomain == null ? 43 : $subdomain.hashCode());
        result = result * PRIME + (this.isUse_linkedin_profile_certification() ? 79 : 97);
        final Object $completion_page_html = this.getCompletion_page_html();
        result = result * PRIME + ($completion_page_html == null ? 43 : $completion_page_html.hashCode());
        result = result * PRIME + (this.isUse_custom_completion_page_html() ? 79 : 97);
        result = result * PRIME + (this.isReviews_enabled() ? 79 : 97);
        result = result * PRIME + (this.isGoals_enabled() ? 79 : 97);
        result = result * PRIME + (this.isAutoplay_all_videos() ? 79 : 97);
        result = result * PRIME + (this.isRequire_video_completion() ? 79 : 97);
        final Object $video_completion_percentage = this.getVideo_completion_percentage();
        result = result * PRIME + ($video_completion_percentage == null ? 43 : $video_completion_percentage.hashCode());
        result = result * PRIME + (this.isDisable_chapter_completed_modal() ? 79 : 97);
        final Object $theme = this.getTheme();
        result = result * PRIME + ($theme == null ? 43 : $theme.hashCode());
        final Object $primary_color = this.getPrimary_color();
        result = result * PRIME + ($primary_color == null ? 43 : $primary_color.hashCode());
        final Object $font = this.getFont();
        result = result * PRIME + ($font == null ? 43 : $font.hashCode());
        final Object $logo = this.getLogo();
        result = result * PRIME + ($logo == null ? 43 : $logo.hashCode());
        result = result * PRIME + (this.isShow_logo() ? 79 : 97);
        result = result * PRIME + (this.isDisable_text_selection() ? 79 : 97);
        result = result * PRIME + (this.isHide_lesson_type_label_and_icon() ? 79 : 97);
        result = result * PRIME + (this.isHide_lesson_type_icon() ? 79 : 97);
        result = result * PRIME + (this.is_onboarding_demo_course() ? 79 : 97);
        result = result * PRIME + (this.isSocial_share_course_completion_overridden() ? 79 : 97);
        result = result * PRIME + (this.isSocial_share_chapter_completion_overridden() ? 79 : 97);
        final Object $social_share_message = this.getSocial_share_message();
        result = result * PRIME + ($social_share_message == null ? 43 : $social_share_message.hashCode());
        final Object $facebook_shared_landing_page_url = this.getFacebook_shared_landing_page_url();
        result = result * PRIME + ($facebook_shared_landing_page_url == null ? 43 : $facebook_shared_landing_page_url.hashCode());
        final Object $linkedin_shared_landing_page_url = this.getLinkedin_shared_landing_page_url();
        result = result * PRIME + ($linkedin_shared_landing_page_url == null ? 43 : $linkedin_shared_landing_page_url.hashCode());
        final Object $twitter_shared_landing_page_url = this.getTwitter_shared_landing_page_url();
        result = result * PRIME + ($twitter_shared_landing_page_url == null ? 43 : $twitter_shared_landing_page_url.hashCode());
        final Object $shared_landing_page_url = this.getShared_landing_page_url();
        result = result * PRIME + ($shared_landing_page_url == null ? 43 : $shared_landing_page_url.hashCode());
        final Object $chapter_ids = this.getChapter_ids();
        result = result * PRIME + ($chapter_ids == null ? 43 : $chapter_ids.hashCode());
        result = result * PRIME + this.getProduct_id();
        return result;
    }

    public String toString() {
        return "Course(id=" + this.getId() + ", name=" + this.getName() + ", slug=" + this.getSlug() + ", landing_page_url=" + this.getLanding_page_url() + ", checkout_page_url=" + this.getCheckout_page_url() + ", site_twitter_handle=" + this.getSite_twitter_handle() + ", support_email=" + this.getSupport_email() + ", subdomain=" + this.getSubdomain() + ", use_linkedin_profile_certification=" + this.isUse_linkedin_profile_certification() + ", completion_page_html=" + this.getCompletion_page_html() + ", use_custom_completion_page_html=" + this.isUse_custom_completion_page_html() + ", reviews_enabled=" + this.isReviews_enabled() + ", goals_enabled=" + this.isGoals_enabled() + ", autoplay_all_videos=" + this.isAutoplay_all_videos() + ", require_video_completion=" + this.isRequire_video_completion() + ", video_completion_percentage=" + this.getVideo_completion_percentage() + ", disable_chapter_completed_modal=" + this.isDisable_chapter_completed_modal() + ", theme=" + this.getTheme() + ", primary_color=" + this.getPrimary_color() + ", font=" + this.getFont() + ", logo=" + this.getLogo() + ", show_logo=" + this.isShow_logo() + ", disable_text_selection=" + this.isDisable_text_selection() + ", hide_lesson_type_label_and_icon=" + this.isHide_lesson_type_label_and_icon() + ", hide_lesson_type_icon=" + this.isHide_lesson_type_icon() + ", is_onboarding_demo_course=" + this.is_onboarding_demo_course() + ", social_share_course_completion_overridden=" + this.isSocial_share_course_completion_overridden() + ", social_share_chapter_completion_overridden=" + this.isSocial_share_chapter_completion_overridden() + ", social_share_message=" + this.getSocial_share_message() + ", facebook_shared_landing_page_url=" + this.getFacebook_shared_landing_page_url() + ", linkedin_shared_landing_page_url=" + this.getLinkedin_shared_landing_page_url() + ", twitter_shared_landing_page_url=" + this.getTwitter_shared_landing_page_url() + ", shared_landing_page_url=" + this.getShared_landing_page_url() + ", chapter_ids=" + this.getChapter_ids() + ", product_id=" + this.getProduct_id() + ")";
    }
}