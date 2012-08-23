<!DOCTYPE html>
<html>
<head>
    <title>Favourite TimeSheer</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="http://code.jquery.com/mobile/1.2.0-alpha.1/jquery.mobile-1.2.0-alpha.1.min.css" />
    <script src="http://code.jquery.com/jquery-1.7.2.min.js"></script>
    <script src="http://code.jquery.com/mobile/1.2.0-alpha.1/jquery.mobile-1.2.0-alpha.1.min.js"></script>
</head>
<body>

<div data-role="page" data-theme="e">
    <div data-role="header">
        <h1>My Favourite Time Sheet</h1>
    </div><!-- /header -->
    <label for="basic">Favourite TimeSheet Name</label>
    <input type="text" name="name" id="basic" value=""  />

    <label for="select-choice-0" class="select">Country</label>
    <select name="select-choice-0" id="select-choice-0">
        <option value="India">India</option>
        <option value="China">China</option>
        <option value="UEA">UEA</option>
        <option value="Italy">Italy</option>
    </select>
    <label for="search-basic">Activity( Client Project Sub Project)</label>
    <input type="search" name="search" id="search-basic" value="" data-mini="true"/>
    <fieldset data-role="controlgroup">
        <legend>Billable?</legend>
        <input type="radio" name="radio-choice" id="radio-choice-1" value="yes" checked="checked" />
        <label for="radio-choice-1">Yes</label>

        <input type="radio" name="radio-choice" id="radio-choice-2" value="yes"  />
        <label for="radio-choice-2">No</label>
    </fieldset>
</div><!-- /page -->

</body>
</html>

