
describe("Favourite Timesheet", function() {

    beforeEach(function() {

    });

    it("should be able to validate empty name", function() {
        var favorite = new FavoriteTimesheet();
        favorite.setName("");

        expect(favorite.validate()).toEqual(false);
    });

    /*it("should be able to populate state combo for USA", function() {

    });

    it("should be able to populate state combo for any other", function() {

    });*/



});


