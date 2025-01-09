package com.video.download.thinkific.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@AllArgsConstructor
@NoArgsConstructor
public class Chapter {
    public int id;
    public String name;
    public int position;
    public int course_id;
    public ArrayList<Integer> content_ids;

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getPosition() {
        return this.position;
    }

    public int getCourse_id() {
        return this.course_id;
    }

    public ArrayList<Integer> getContent_ids() {
        return this.content_ids;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public void setCourse_id(int course_id) {
        this.course_id = course_id;
    }

    public void setContent_ids(ArrayList<Integer> content_ids) {
        this.content_ids = content_ids;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Chapter)) return false;
        final Chapter other = (Chapter) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.getId() != other.getId()) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        if (this.getPosition() != other.getPosition()) return false;
        if (this.getCourse_id() != other.getCourse_id()) return false;
        final Object this$content_ids = this.getContent_ids();
        final Object other$content_ids = other.getContent_ids();
        if (this$content_ids == null ? other$content_ids != null : !this$content_ids.equals(other$content_ids))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Chapter;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + this.getId();
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        result = result * PRIME + this.getPosition();
        result = result * PRIME + this.getCourse_id();
        final Object $content_ids = this.getContent_ids();
        result = result * PRIME + ($content_ids == null ? 43 : $content_ids.hashCode());
        return result;
    }

    public String toString() {
        return "Chapter(id=" + this.getId() + ", name=" + this.getName() + ", position=" + this.getPosition() + ", course_id=" + this.getCourse_id() + ", content_ids=" + this.getContent_ids() + ")";
    }
}