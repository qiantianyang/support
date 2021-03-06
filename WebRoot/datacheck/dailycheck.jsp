﻿<%@page contentType="text/html;charset=utf-8"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@  taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Wildfire-Support</title>
<meta name="viewport"
	content="width = device-width, initial-scale = 1.0, minimum-scale = 1.0, maximum-scale = 1.0, user-scalable = no" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="refresh" content="43200">
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" />
<link href="css/footable.core.css?v=2-0-1" rel="stylesheet"
	type="text/css" />
<link href="css/footable-demos.css" rel="stylesheet" type="text/css" />

<script src="js/jquery.min.js" type="text/javascript"></script>
<script src="http://code.highcharts.com/highcharts.js"></script>
<script src="http://code.highcharts.com/modules/exporting.js"></script>

<script>
	if (!window.jQuery) {
		document.write('<script src="js/jquery-1.9.1.min.js"><\/script>');
	}
</script>
<script src="js/footable.js?v=2-0-1" type="text/javascript"></script>
<script src="js/footable.sort.js?v=2-0-1" type="text/javascript"></script>
<script src="js/footable.filter.js?v=2-0-1" type="text/javascript"></script>
<script src="js/footable.paginate.js?v=2-0-1" type="text/javascript"></script>
<script src="js/footable.bookmarkable.js?v=2-0-1" type="text/javascript"></script>
<script src="js/bootstrap-tab.js" type="text/javascript"></script>
<script src="js/demos.js" type="text/javascript"></script>

<script type="text/javascript">
	$(function() {
		$("#demo").load("historicalData.action", {});
	});
	$(function() {	
		$("#sqs").load("sqs.action", {});
		setInterval(function() {
    		$("#sqs").load("sqs.action", {});
		}, 60000);
		
	});
</script>
<style>
.a{width:721px;}
.adleft{ float:left;width:50%; padding:5px;}
.adright{float:right;width:48%;padding:5px;}
.adright2{float:right;width:48%; border:0px solid #333;	padding:5px;}
</style>
</head>
<body>
	<div class="demo-container">

		<div class="alert">
			dailycheck 2.0 (beta) ---> <a href="index.action">原版</a>
		</div>
	
		<div class="tab-content">

			<div class="adleft" id="demo">
				<img src="../images/window_loading.gif" alt="" />
			</div>
			
			<div class="adright2 alert" id="sqs">
				<img src="../images/window_loading.gif" alt="" />
			</div>

			
			<div class="adright" id="chart"></div>
				
		

		
			

			




		</div>
	</div>

</body>
<script type="text/javascript">
	var dateTmp;
	var sum;
	(function($) {
		var dateTmp = "";
		var sum = "";
		$.post("/support/datacheck/historicalChart.action",
				function(root) {
					dateTmp = new Array(root.length);
					sum = new Array(root.length);

					for ( var i = 0; i < root.length; i++) {
						dateTmp[i] = root[i].date;
						sum[i] = root[i].sum;
					}
					/* alert(dateTmp);
					alert(sum); */
					$('#chart').highcharts({
						credits : {
							enabled : false
						},
						chart : {
							type : 'spline',
							backgroundColor : '#eee',
							reflow : true
						},
						title : {
							text : '最近30天错误量',
							x : -20
						//center
						},
						xAxis : {
							categories : dateTmp
						},
						yAxis : {
							title : {
								text : 'Error Num'
							},
							plotLines : [ {
								value : 0,
								width : 1,
								color : '#808080'
							} ]
						},
						tooltip : {
							valueSuffix : ''
						},
						series : [ {
							name : 'Error Num:',

							data : sum
						} ]
					});
				});

	})(jQuery);
</script>
</html>
