package eventApi.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class EventData {

    @NotNull
    @Size(max=100)
    private String name;

    @Size(max=10000)
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

