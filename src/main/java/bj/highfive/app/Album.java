package bj.highfive.app;

import java.util.List;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Album {

    public Album() {
    }

    public Album(
            String ref,
            String title,
            String description,
            String duration,
            Boolean status,
            String url,

            List<String> tags,
            String like_count,
            String name
        ) {
        this.ref = ref;
        this.title = title;
        this.description = description;
        this.duration = duration;
        this.status = status;
        this.url = url;
        this.tags = tags;
        this.like_count = like_count;
        this.name = name;
    }

    // Propriété id avec le getters et le setters
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    // Propriété ref avec le getters et le setters
    private String ref;

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    // Propriété title avec le getters et le setters
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // Propriété description avec le getters et le setters
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // Propriété duration avec le getters et le setters
    private String duration;

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    // Propriété status avec le getters et le setters
    private Boolean status;

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    // Propriété url avec le getters et le setters
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    // Propriété tags avec le getters et le setters
    private List<String> tags;

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    // Propriété like avec le getters et le setters
    private String like_count;



    public String getLike_count() {
        return like_count;
    }

    public void setLike_count(String like_count) {
        this.like_count = like_count;
    }

    // Propriété name avec le getters et le setters
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {

        if (!(obj instanceof Album)) {
            return true;
        }

        if (!(obj instanceof Album)) {
            return false;
        }

        Album Ob = (Album) obj;
        return Objects.equals(this.id, Ob.id) && Objects.equals(this.name, Ob.name)
                && Objects.equals(this.title, Ob.title);

    }

    public int hashCode() {
        return Objects.hash(this.id, this.name, this.title);

    }

    @Override
    public String toString() {
        return "Album { " + "id: " + this.id + ", name: " + this.name + " } ";
    }

}
