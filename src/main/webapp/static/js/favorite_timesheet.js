function FavoriteTimesheet()
{
    this.name = "";

    this.errors = [];

    this.setName = function(name) {
        this.name = name;
    };

    this.validate = function() {
        this.errors = [];

        if ( this.name == "" ) {
            this.errors.push({field:"name", message:"Name field can not be blank."});
            return false;
        }

        return true;
    };

    this.getErrors = function() {
        return this.errors;
    };
}