package modals;

import play.data.validation.Constraints;

public class twitterModal {
    @Constraints.Required
    protected String keyword;

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getKeyword() {
        return keyword;
    }
}
