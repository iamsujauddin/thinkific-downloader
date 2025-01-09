package com.video.download.thinkific.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Content {
    public int id;
    public int position;
    public int chapter_id;
    public String name;
    public String contentable_type;
    public String slug;
    public boolean is_free_trial;
    public int next_content_id;
    public String next_content_slug;
    public String next_content_type;
    public String display_name;
    public int contentable;
    public int contentable_id;
    public boolean payment_required;
    public boolean draft;
    public boolean is_released;
    public Object release_date;
    public boolean prerequisite;
    public int total_post_count;
    public boolean discussions_enabled;
    public Metadata meta_data;
    public boolean expand_enabled;
    public Object lesson_type_label;
    public Object lesson_type_icon;
    public String default_lesson_type_label;
    public String default_lesson_type_icon;
    public boolean under_construction;

    public int getId() {
        return this.id;
    }

    public int getPosition() {
        return this.position;
    }

    public int getChapter_id() {
        return this.chapter_id;
    }

    public String getName() {
        return this.name;
    }

    public String getContentable_type() {
        return this.contentable_type;
    }

    public String getSlug() {
        return this.slug;
    }

    public boolean is_free_trial() {
        return this.is_free_trial;
    }

    public int getNext_content_id() {
        return this.next_content_id;
    }

    public String getNext_content_slug() {
        return this.next_content_slug;
    }

    public String getNext_content_type() {
        return this.next_content_type;
    }

    public String getDisplay_name() {
        return this.display_name;
    }

    public int getContentable() {
        return this.contentable;
    }

    public int getContentable_id() {
        return this.contentable_id;
    }

    public boolean isPayment_required() {
        return this.payment_required;
    }

    public boolean isDraft() {
        return this.draft;
    }

    public boolean is_released() {
        return this.is_released;
    }

    public Object getRelease_date() {
        return this.release_date;
    }

    public boolean isPrerequisite() {
        return this.prerequisite;
    }

    public int getTotal_post_count() {
        return this.total_post_count;
    }

    public boolean isDiscussions_enabled() {
        return this.discussions_enabled;
    }

    public Metadata getMeta_data() {
        return this.meta_data;
    }

    public boolean isExpand_enabled() {
        return this.expand_enabled;
    }

    public Object getLesson_type_label() {
        return this.lesson_type_label;
    }

    public Object getLesson_type_icon() {
        return this.lesson_type_icon;
    }

    public String getDefault_lesson_type_label() {
        return this.default_lesson_type_label;
    }

    public String getDefault_lesson_type_icon() {
        return this.default_lesson_type_icon;
    }

    public boolean isUnder_construction() {
        return this.under_construction;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public void setChapter_id(int chapter_id) {
        this.chapter_id = chapter_id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContentable_type(String contentable_type) {
        this.contentable_type = contentable_type;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public void set_free_trial(boolean is_free_trial) {
        this.is_free_trial = is_free_trial;
    }

    public void setNext_content_id(int next_content_id) {
        this.next_content_id = next_content_id;
    }

    public void setNext_content_slug(String next_content_slug) {
        this.next_content_slug = next_content_slug;
    }

    public void setNext_content_type(String next_content_type) {
        this.next_content_type = next_content_type;
    }

    public void setDisplay_name(String display_name) {
        this.display_name = display_name;
    }

    public void setContentable(int contentable) {
        this.contentable = contentable;
    }

    public void setContentable_id(int contentable_id) {
        this.contentable_id = contentable_id;
    }

    public void setPayment_required(boolean payment_required) {
        this.payment_required = payment_required;
    }

    public void setDraft(boolean draft) {
        this.draft = draft;
    }

    public void set_released(boolean is_released) {
        this.is_released = is_released;
    }

    public void setRelease_date(Object release_date) {
        this.release_date = release_date;
    }

    public void setPrerequisite(boolean prerequisite) {
        this.prerequisite = prerequisite;
    }

    public void setTotal_post_count(int total_post_count) {
        this.total_post_count = total_post_count;
    }

    public void setDiscussions_enabled(boolean discussions_enabled) {
        this.discussions_enabled = discussions_enabled;
    }

    public void setMeta_data(Metadata meta_data) {
        this.meta_data = meta_data;
    }

    public void setExpand_enabled(boolean expand_enabled) {
        this.expand_enabled = expand_enabled;
    }

    public void setLesson_type_label(Object lesson_type_label) {
        this.lesson_type_label = lesson_type_label;
    }

    public void setLesson_type_icon(Object lesson_type_icon) {
        this.lesson_type_icon = lesson_type_icon;
    }

    public void setDefault_lesson_type_label(String default_lesson_type_label) {
        this.default_lesson_type_label = default_lesson_type_label;
    }

    public void setDefault_lesson_type_icon(String default_lesson_type_icon) {
        this.default_lesson_type_icon = default_lesson_type_icon;
    }

    public void setUnder_construction(boolean under_construction) {
        this.under_construction = under_construction;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Content)) return false;
        final Content other = (Content) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.getId() != other.getId()) return false;
        if (this.getPosition() != other.getPosition()) return false;
        if (this.getChapter_id() != other.getChapter_id()) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        final Object this$contentable_type = this.getContentable_type();
        final Object other$contentable_type = other.getContentable_type();
        if (this$contentable_type == null ? other$contentable_type != null : !this$contentable_type.equals(other$contentable_type))
            return false;
        final Object this$slug = this.getSlug();
        final Object other$slug = other.getSlug();
        if (this$slug == null ? other$slug != null : !this$slug.equals(other$slug)) return false;
        if (this.is_free_trial() != other.is_free_trial()) return false;
        if (this.getNext_content_id() != other.getNext_content_id()) return false;
        final Object this$next_content_slug = this.getNext_content_slug();
        final Object other$next_content_slug = other.getNext_content_slug();
        if (this$next_content_slug == null ? other$next_content_slug != null : !this$next_content_slug.equals(other$next_content_slug))
            return false;
        final Object this$next_content_type = this.getNext_content_type();
        final Object other$next_content_type = other.getNext_content_type();
        if (this$next_content_type == null ? other$next_content_type != null : !this$next_content_type.equals(other$next_content_type))
            return false;
        final Object this$display_name = this.getDisplay_name();
        final Object other$display_name = other.getDisplay_name();
        if (this$display_name == null ? other$display_name != null : !this$display_name.equals(other$display_name))
            return false;
        if (this.getContentable() != other.getContentable()) return false;
        if (this.getContentable_id() != other.getContentable_id()) return false;
        if (this.isPayment_required() != other.isPayment_required()) return false;
        if (this.isDraft() != other.isDraft()) return false;
        if (this.is_released() != other.is_released()) return false;
        final Object this$release_date = this.getRelease_date();
        final Object other$release_date = other.getRelease_date();
        if (this$release_date == null ? other$release_date != null : !this$release_date.equals(other$release_date))
            return false;
        if (this.isPrerequisite() != other.isPrerequisite()) return false;
        if (this.getTotal_post_count() != other.getTotal_post_count()) return false;
        if (this.isDiscussions_enabled() != other.isDiscussions_enabled()) return false;
        final Object this$meta_data = this.getMeta_data();
        final Object other$meta_data = other.getMeta_data();
        if (this$meta_data == null ? other$meta_data != null : !this$meta_data.equals(other$meta_data)) return false;
        if (this.isExpand_enabled() != other.isExpand_enabled()) return false;
        final Object this$lesson_type_label = this.getLesson_type_label();
        final Object other$lesson_type_label = other.getLesson_type_label();
        if (this$lesson_type_label == null ? other$lesson_type_label != null : !this$lesson_type_label.equals(other$lesson_type_label))
            return false;
        final Object this$lesson_type_icon = this.getLesson_type_icon();
        final Object other$lesson_type_icon = other.getLesson_type_icon();
        if (this$lesson_type_icon == null ? other$lesson_type_icon != null : !this$lesson_type_icon.equals(other$lesson_type_icon))
            return false;
        final Object this$default_lesson_type_label = this.getDefault_lesson_type_label();
        final Object other$default_lesson_type_label = other.getDefault_lesson_type_label();
        if (this$default_lesson_type_label == null ? other$default_lesson_type_label != null : !this$default_lesson_type_label.equals(other$default_lesson_type_label))
            return false;
        final Object this$default_lesson_type_icon = this.getDefault_lesson_type_icon();
        final Object other$default_lesson_type_icon = other.getDefault_lesson_type_icon();
        if (this$default_lesson_type_icon == null ? other$default_lesson_type_icon != null : !this$default_lesson_type_icon.equals(other$default_lesson_type_icon))
            return false;
        if (this.isUnder_construction() != other.isUnder_construction()) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Content;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + this.getId();
        result = result * PRIME + this.getPosition();
        result = result * PRIME + this.getChapter_id();
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        final Object $contentable_type = this.getContentable_type();
        result = result * PRIME + ($contentable_type == null ? 43 : $contentable_type.hashCode());
        final Object $slug = this.getSlug();
        result = result * PRIME + ($slug == null ? 43 : $slug.hashCode());
        result = result * PRIME + (this.is_free_trial() ? 79 : 97);
        result = result * PRIME + this.getNext_content_id();
        final Object $next_content_slug = this.getNext_content_slug();
        result = result * PRIME + ($next_content_slug == null ? 43 : $next_content_slug.hashCode());
        final Object $next_content_type = this.getNext_content_type();
        result = result * PRIME + ($next_content_type == null ? 43 : $next_content_type.hashCode());
        final Object $display_name = this.getDisplay_name();
        result = result * PRIME + ($display_name == null ? 43 : $display_name.hashCode());
        result = result * PRIME + this.getContentable();
        result = result * PRIME + this.getContentable_id();
        result = result * PRIME + (this.isPayment_required() ? 79 : 97);
        result = result * PRIME + (this.isDraft() ? 79 : 97);
        result = result * PRIME + (this.is_released() ? 79 : 97);
        final Object $release_date = this.getRelease_date();
        result = result * PRIME + ($release_date == null ? 43 : $release_date.hashCode());
        result = result * PRIME + (this.isPrerequisite() ? 79 : 97);
        result = result * PRIME + this.getTotal_post_count();
        result = result * PRIME + (this.isDiscussions_enabled() ? 79 : 97);
        final Object $meta_data = this.getMeta_data();
        result = result * PRIME + ($meta_data == null ? 43 : $meta_data.hashCode());
        result = result * PRIME + (this.isExpand_enabled() ? 79 : 97);
        final Object $lesson_type_label = this.getLesson_type_label();
        result = result * PRIME + ($lesson_type_label == null ? 43 : $lesson_type_label.hashCode());
        final Object $lesson_type_icon = this.getLesson_type_icon();
        result = result * PRIME + ($lesson_type_icon == null ? 43 : $lesson_type_icon.hashCode());
        final Object $default_lesson_type_label = this.getDefault_lesson_type_label();
        result = result * PRIME + ($default_lesson_type_label == null ? 43 : $default_lesson_type_label.hashCode());
        final Object $default_lesson_type_icon = this.getDefault_lesson_type_icon();
        result = result * PRIME + ($default_lesson_type_icon == null ? 43 : $default_lesson_type_icon.hashCode());
        result = result * PRIME + (this.isUnder_construction() ? 79 : 97);
        return result;
    }

    public String toString() {
        return "Content(id=" + this.getId() + ", position=" + this.getPosition() + ", chapter_id=" + this.getChapter_id() + ", name=" + this.getName() + ", contentable_type=" + this.getContentable_type() + ", slug=" + this.getSlug() + ", is_free_trial=" + this.is_free_trial() + ", next_content_id=" + this.getNext_content_id() + ", next_content_slug=" + this.getNext_content_slug() + ", next_content_type=" + this.getNext_content_type() + ", display_name=" + this.getDisplay_name() + ", contentable=" + this.getContentable() + ", contentable_id=" + this.getContentable_id() + ", payment_required=" + this.isPayment_required() + ", draft=" + this.isDraft() + ", is_released=" + this.is_released() + ", release_date=" + this.getRelease_date() + ", prerequisite=" + this.isPrerequisite() + ", total_post_count=" + this.getTotal_post_count() + ", discussions_enabled=" + this.isDiscussions_enabled() + ", meta_data=" + this.getMeta_data() + ", expand_enabled=" + this.isExpand_enabled() + ", lesson_type_label=" + this.getLesson_type_label() + ", lesson_type_icon=" + this.getLesson_type_icon() + ", default_lesson_type_label=" + this.getDefault_lesson_type_label() + ", default_lesson_type_icon=" + this.getDefault_lesson_type_icon() + ", under_construction=" + this.isUnder_construction() + ")";
    }
}